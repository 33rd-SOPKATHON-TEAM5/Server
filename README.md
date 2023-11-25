# 솝커톤 웹5조 - 🎅🏻😭울보 산타😭🎅🏻

> 울보 산타에게 나의 울었던 이야기를 털어놓고, 다른 사람들의 이야기를 보며 크리스마스를 좀 더 따뜻하게 보내볼까요?
> 

## 🧸 Team

<img src="https://github.com/33rd-SOPKATHON-TEAM5/Server/assets/80024278/0d9fd732-f74e-4d79-9e0e-202dedf68a83" width=650/>


#우리는 하나다


|                             박예준                             |                                                                김보람                                                                 |
| :----------------------------------------------------------: |:----------------------------------------------------------------------------------------------------------------------------------:|
| <img src="https://avatars.githubusercontent.com/u/80024278?v=4" width="200"/> | <img src="https://avatars.githubusercontent.com/u/128011308?s=400&u=633d530e6863dea1ad9f409fd2f979b85c018b6f&v=4" width="200"/> |
|              [jun02160](https://github.com/jun02160)               |                                             [bo-ram-bo-ram](https://github.com/bo-ram-bo-ram)



| 담당 역할              |   Role   |
|:-------------------|:--------:|
| 프로젝트 초기 세팅       |   박예준    |
| 배포                  |   박예준    |
| DB 설계              | 박예준, 김보람 |
| 나의 눈물 기록 등록 API  |   박예준    |
| 전체 눈물 기록 조회 API  |   김보람    |
| 선물 카드 조회 API      |   김보람    |

## 🛠️ 개발 환경
| 통합 개발 환경 | IntelliJ |
| --- | --- |
| Spring 버전 | 3.0.12 |
| 데이터베이스 | AWS RDS(MySQL) |
| 배포 | AWS EC2(Ubuntu) |
| Project 빌드 관리 도구 | Gradle |
| ERD 다이어그램 툴 | MySQL Workbench |
| Java version | Java 17 |
| 패키지 구조 | 계층형 패키지 구조 |

### 아키텍쳐 구조도
<img width="919" alt="image" src="https://github.com/33rd-SOPKATHON-TEAM5/Server/assets/80024278/c4c674a8-df5f-4868-843c-2800d15915bc"/>

# 프로젝트 폴더 구조도
```
📂 sopkathonServer

🗂 java/sopt/org/sopkathonServer
  🗂 common
      🗂 brand
          🗂 advice
          🗂 exception
  🗂 config
  🗂 controller
      🗂 dto
  🗂 domain
  🗂 infrastructure
  🗂 service
🗂 resources
  application-local.yml
  application-dev.yml
```


### API 명세서

[API 명세서](https://lemon-leather-188.notion.site/API-5099a39c67544ee287f8af9a823dff4d?pvs=4) 

### 데이터베이스 ERD
<img src="https://github.com/33rd-SOPKATHON-TEAM5/Server/assets/80024278/4c12c139-a425-494d-9ebd-86ca3d559ee1" width=450/>

## 🎬 실행 방법

1. 원격저장소 복제 
    
    `git clone https://github.com/33rd-SOPKATHON-TEAM5/Server.git`
    
2. 환경변수 세팅
    - `DATABASE_ENDPOINT_URL`
    - `DATABASE_NAME`
    - `DATABASE_USER`
    - `DATABASE_PASSWORD`
    - `GPT_OPENAPI_KEY`
    
    이를 포함한 구성은 application.yml에서 설정한다.
    
3. 애플리케이션 빌드 및 실행
    
    ```bash
    ./gradlew clean build -x test
    cd build/libs
    java -jar sopkathonServer-0.0.1-SNAPSHOT.jar
    ```
    
# 👥 우리들의 컨벤션

[Backend Convention](https://www.notion.so/Convention-63f072abdafb445eb84710d223cf5330?pvs=21)



