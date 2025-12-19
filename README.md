## Spring Boot 서버
`/config/settings.properties`에서 기본 설정이 가능합니다.

# API DOCS
모든 API 요청 정리입니다.  
Request : 요청 시 필요한 값
Response : 요청 시 반환하는 값

## 1.GET `/api/health`
서버 alive 체크용
### Request
null
### Response
HTTP Code: 200  
`건강합니다.`

## 2.POST `/api/user/signup`
회원 가입
### Request
```json
{
    "userId": "...",
    "password": "...",
    "name": "..."
}
```
### Reponse 
HTTP Code: 201  
`회원가입에 성공했습니다!`

## 2.POST `/login`
로그인
### Request
```json
{
    "username": "...",
    "password": "...",
}
```
### Reponse 
HTTP Code: 200
`서버에서 생성한 인증용 JWT 토큰 값`

## 2.GET `/auth/camera`
모든 카메라 목록을 조회합니다.
### Request
null
### Reponse 
HTTP Code: 200
```json
[
    {
        "deviceId": "카메라ID",
        "status": "카메라 상태",
        "address": "카메라 주소",
        "lastUpdate": "카메라와 마지막으로 소통한 시간",
        "ipAddress": "카메라의 IP"
    },
    {
        ...
    }
]
```

..작성 중

