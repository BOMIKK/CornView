### 콘 뷰(2021.02.28~2021.03.01)

---
### [시연동영상](https://youtu.be/im84LMwswjQ)


#### 1. 작품소개

ㅇ 기획의도
- 공연을 가는 사람들에게 미리 예매할 좌석의 시야를 제공하기 위한 사이트

- 대상 : 잠실실내체육관, 고척스카이돔, KSPO DOME


#### 2. 사용한 툴, 언어

- Spring FrameWork
- MYSQL, AWS
- HTML, CSS, JavaScript, JQuery
- Image Map
- Swiper JS


#### 3. 과정

1. 데이터수집
    - 트위터 계정 크롤링
    - 서치하여 수작업
2. 목표 
    - 포르폴리오용 웹 제작
3. 기능
    1. 콘서트 뷰 확인
        - 경기장별 전체 이미지 확인
        - 구역별 이미지 확인 - 검색가능
4. 개발환경
    1. Front-end
        - html, css, js 로..
        - 다른 js 라이브러리가 추가될수도
    2. Back-end 
        - 서버 : aws, azure 등의 free trial이용
        - 개발툴 : springframework, sts이용
        - DB : mySQL
5. 기획&디자인 
    - UX 화면 와이어프레임
    - GUI

    → 모두 피그마로!

#### 4. To do List

    02/28 to do list

    1. 서버사진 등록
    2. aws서버 생성
    3. DB 사진 정보 저장
    4. 뷰 생성

    3/1

    1. 이미지 연결
    2. 스와이프 UI 생성
    3. 이미지 map 설정

#### 5. 구현 사진
1) 메인 화면 
![메인 화면](/portfolio/main.png)

2) 좌석 선택 
![좌석선택](/portfolio/ch.png)

3) 근처 좌석 뷰 
![근처좌석뷰](/portfolio/v_ch.png)


#### 6. 후기

처음에는 Python을 사용하여 트위터 크롤링을 통해 데이터를 모으려 했으나, 시야 사진 데이터가 한정적이여서 직접 수작업을 통해 3가지의 공연장의 데이터를 수집하였다. Spring Framework를 사용하여 웹을 구성하였고, 처음 피그마로 구현한 UI, UX의 전반적인 내용을 구현 완료하였다. 
