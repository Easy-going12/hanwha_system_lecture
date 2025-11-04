FROM node:lts-alpine

## curl(clinet-url) 설치
## --no-cache의 역할은 curl 결과를 저장하는데 이러면 컨테이너가 무거워지기 때문에 캐시를 쓰지 말라는 표시
RUN apk add --no-cache curl

WORKDIR /app

COPY . .

RUN npm install

## npm run dev -- host 0.0.0.0
## --host 0.0.0.0은 네트워크 인터페이스에서 접속을 허용(Docker 컨테이너 외붜의 아무 IP에서나 접속 가능)
## 중간에 이중 대쉬(--)는 npm 명령어와ㅏ 구분하기 위한 구분자
CMD ["npm","run","dev","--", "--host","0.0.0.0"]