import os
import datetime
import random

# 폴더 생성 함수
def create_folder(path):
    if not os.path.exists(path):
        os.makedirs(path)

# 현재 날짜 및 TenantId 가져오기
now = datetime.datetime.now()
tenant_id = "your_tenant_id"

# 폴더 경로 생성
base_path = os.path.join(os.getcwd(), tenant_id, now.strftime("%Y"), now.strftime("%m"), now.strftime("%d"))

# 폴더 생성
create_folder(base_path)

# 시간 폴더 생성 및 CSV 파일 생성
for hour in range(0, 24):
    hour_path = os.path.join(base_path, f"{hour:02d}")
    create_folder(hour_path)

    for minute in range(0, 60):
        file_path = os.path.join(hour_path, f"{hour:02d}_{minute:02d}.csv")
        with open(file_path, "w", newline="") as csvfile:
            csvfile.write("timestamp,data\n")
            current_timestamp = now.replace(hour=hour, minute=minute, second=0, microsecond=0)
            for _ in range(1, 61):
                data = random.randint(1, 100000)
                csvfile.write(f"{current_timestamp.isoformat()},{data}\n")
                current_timestamp += datetime.timedelta(seconds=1)

print("폴더 및 CSV 파일 생성 완료!")