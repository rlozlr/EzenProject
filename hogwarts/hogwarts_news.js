const main = document.querySelector('.main');
let news = document.querySelector('.news'); // news 요소를 선택하는 방법을 수정
let magicInput = "";
const magicBook = [
        "리벨리오 : 숨겨져 있는걸 보여주기",
        "루모스 : 불 켜기기",
        "녹스 : 불 끄기",
        "살비오 헥시아 : 투명하게",
        "리듀시오 : 물체를 작게",
        "잉그로지오 : 물체를 크게",
        "플리펜도 : 사물을 밀거나 뒤집기",
        "디핀도 : 찢기",
        "피니트 : 모든 주문 효과를 무효화",
        "아씨오 매직북 : 쓸 수 있는 마법 설명"
    ];
const magicSpell = magicBook.map(spell => spell.split(':')[0].trim());
console.log(magicSpell);        

// main을 클릭하면~
main.addEventListener('click', () => {
    magicInput = writeMagic();
    let isSpellMatched = false;

    for (let i = 0; i < magicBook.length; i++) {
        if (magicInput === magicSpell[i]) {
            isSpellMatched = true;

            // 리벨리오 : 뉴스 보여주기
            if (magicInput == magicSpell[0]) {
                revelio();
            }
            // 루모스 : 뉴스 밝게
            else if (magicInput == magicSpell[1]) {
                lumos();
            }
            // 녹스 : 뉴스 어둡게 만들기
            else if (magicInput == magicSpell[2]) {
                nox();
            }
            // 살비오 헥시아 : 뉴스를 투명하게
            else if (magicInput == magicSpell[3]) {
                salvioHexia();
            }
            // 리듀시오 : 뉴스를 작게
            else if (magicInput == magicSpell[4]) {
                reducio();
            }
            // 잉그로지오 : 뉴스를 크게
            else if (magicInput == magicSpell[5]) {
                engorgio();
            }
            // 플리펜도 : 다음 뉴스
            else if (magicInput == magicSpell[6]) {
                flipendo();
            }
            // 디핀도 : 뉴스 찢기
            else if (magicInput == magicSpell[7]) {
                diffindo()
            }
            // 피니트 : 주문 효과를 없앰
            else if (magicInput == magicSpell[8]) {
                finite();
            }
            else if (magicInput == magicSpell[9]) {
                accio();
            }
            break; // 일치하는 주문을 찾았으므로 루프 종료
        }
    }
    if (!isSpellMatched) {
        alert("프로테고!\n잘못된 마법을 시도하다 주문이 튕겨나갔습니다.");
    }
});

function writeMagic(){
    let magicInput = prompt("주문을 말하시오.");
    return magicInput;
};

function accio() {
    const popupWidth = 400;
    const popupHeight = 300;

    const left = (window.innerWidth - popupWidth) / 2;
    const top = (window.innerHeight - popupHeight) / 2;

    // magicInput이 "아씨오 매직북"일 때만 팝업 열기
    if (magicInput === "아씨오 매직북") {
        const popup = window.open('', '_blank', `width=${popupWidth}, height=${popupHeight}, left=${left}, top=${top}`);

        if (popup) {
            const content = `${magicBook.map(spell => `<p>${spell}</p>`).join('')}`;
            popup.document.write(content);
            popup.document.close();
        } else {
            console.error('팝업창이 차단되었거나 열 수 없습니다. 브라우저 설정에서 팝업을 허용해주세요.');
        }
    }
}

function revelio(){
    news.innerHTML = '<img src="image/news_IMG 3.jpg" alt="news" class="news-image">';
    const newsImage = document.querySelector('.news-image'); // 이미지 요소를 선택
    fadeIn(newsImage); // fadeIn 함수에 이미지 요소를 전달
};

function nox(){
    const newsImage = document.querySelector('.news-image');
    const overlay = document.createElement('div');
    overlay.classList.add('nox-overlay');
    news.appendChild(overlay);
};

function lumos(){
    const newsImage = document.querySelector('.news-image');
    const overlay = document.querySelector('.nox-overlay'); // "nox-overlay" 클래스의 요소를 선택
    if (overlay) {
    // "lumos-overlay" 클래스의 요소가 존재하는 경우, 해당 요소를 제거하여 이미지를 다시 보이게 함
    overlay.remove();
    }
};

function salvioHexia(){
    const newsImage = document.querySelector('.news-image');
    newsImage.style.opacity = 0.5;
};

let currentWidth = 100; // 초기 값 설정 (기본 100%)
let currentHeight = 100; // 초기 값 설정 (기본 100%)
function reducio(){
    const newsImage = document.querySelector('.news-image');
    currentWidth *= 0.85; // 현재 너비의 절반으로 감소
    currentHeight *= 0.85; // 현재 높이의 절반으로 감소
    applySize(newsImage);
};
function engorgio(){
    const newsImage = document.querySelector('.news-image');
    currentWidth *= 1.25; // 현재 너비의 두 배로 증가
    currentHeight *= 1.25; // 현재 높이의 두 배로 증가
    applySize(newsImage);
}
function applySize(element) {
    element.style.width = `${currentWidth}%`;
    element.style.height = `${currentHeight}%`;
}

let usedNumbers = []; // 함수 외부에서 선언된 배열
function flipendo() {
    // newsImage 가져오기
    const newsImage = document.querySelector('.news-image');
    // changeImg 함수를 호출하고 이미지 파일 이름을 받아오기
    const imageName = changeImg();
    // newsImage의 src 속성 설정
    newsImage.src = `image/${imageName}`;
    
    fadeIn(newsImage);
}
function getRandomNumber() {
    const min = 1;
    const max = 4;
    let randomNumber;
    do {
        randomNumber = Math.floor(Math.random() * (max - min + 1)) + min;
    } while (usedNumbers.includes(randomNumber)); // 이미 나온 숫자라면 다시 생성
    usedNumbers.push(randomNumber); // 나온 숫자를 배열에 추가
    if (usedNumbers.length === 4) {
        // 모든 숫자가 나왔다면 배열 초기화
        alert("더 이상 새로운 뉴스는 없습니다.");
        const newsImage = document.querySelector('.news-image');
        news.innerHTML = '<img src="image/news_IMG 3.jpg" alt="news" class="news-image">';
        usedNumbers = [];
    }
    return randomNumber;
}
function changeImg() {
    // 이미지 파일 이름에 대한 배열
    const imageFiles = ["news_IMG 1.jpg", "news_IMG 2.jpg", "news_IMG 4.jpg", "news_IMG 5.jpg"];
    // 랜덤한 숫자 생성 함수
    // 랜덤한 숫자 가져오기
    const randomImageNumber = getRandomNumber();
    // 가져온 숫자에 따른 이미지 파일 이름 가져오기
    const imageName = imageFiles[randomImageNumber - 1]; // 배열은 0부터 시작하므로 인덱스 조정
    return imageName;
}
function fadeIn(newsImage) {
    newsImage.style.animation = 'fadeInRightToLeft 0.5s forwards'; // 1s는 애니메이션 지속 시간, forwards는 애니메이션 종료 후 상태를 유지
    newsImage.addEventListener('animationend', function () {
        newsImage.style.animation = ''; // 애니메이션이 끝나면 초기화
    }, { once: true });
}


// // 이미지 투명도를 서서히 증가시키는 함수
// function fadeIn(newsImage) {
//     let opacity = 0; // 초기 투명도 설정
//     const interval = 50; // 각 단계마다의 간격 (밀리초)
//     const targetOpacity = 1; // 목표 투명도

//     const timer = setInterval(function () {
//         if (opacity >= targetOpacity) {
//             clearInterval(timer);
//             newsImage.style.opacity = targetOpacity; // 최종 투명도 설정
//         } else {
//             opacity += 0.03; // 각 단계마다 0.05씩 증가
//             newsImage.style.opacity = opacity; // 투명도 설정
//         }
//     }, interval);
// };


function diffindo() {
    const newsImage = document.querySelector('.news-image');
    const newsContainer = document.querySelector('.news');

    const rows = 5; // 이미지를 나눌 행 수
    const cols = 5; // 이미지를 나눌 열 수

    const pieceWidth = newsImage.width / cols;
    const pieceHeight = newsImage.height / rows;

    for (let i = 0; i < rows; i++) {
        for (let j = 0; j < cols; j++) {
            const piece = document.createElement('div');
            piece.classList.add('image-piece');
            piece.style.backgroundImage = `url('${newsImage.src}')`;
            piece.style.backgroundSize = `${newsImage.width}px ${newsImage.height}px`;
            piece.style.backgroundPosition = `-${j * pieceWidth}px -${i * pieceHeight}px`;
            piece.style.width = pieceWidth + 'px';
            piece.style.height = pieceHeight + 'px';

            // 무작위로 애니메이션 속성 설정
            const animationDuration = Math.random() * 4 + 1; // 1부터 5 사이의 무작위 애니메이션 지속 시간 설정 (초 단위)
            const animationDelay = Math.random() * 10; // 0부터 10 사이의 무작위 애니메이션 지연 시간 설정 (초 단위)

            piece.style.animation = `pieceAnimation ${animationDuration}s infinite ${animationDelay}s`;

            newsContainer.appendChild(piece);
        }
    }

    newsImage.style.display = 'none';
};

function finite() {
    const newsContainer = document.querySelector('.news');
    const newsImage = document.querySelector('.news-image');
    const overlay = document.querySelector('.nox-overlay');
    const pieces = document.querySelectorAll('.image-piece');

    // newsContainer 내의 모든 자식 제거
    while (newsContainer.firstChild) {
        newsContainer.removeChild(newsContainer.firstChild);
    }

    // newsImage 초기 상태로 되돌리기
    newsImage.style.display = 'block';
    newsImage.style.width = 'auto';
    newsImage.style.height = 'auto';
    newsImage.src = 'image/news_IMG 3.jpg';
    newsImage.style.opacity = '1';

    // nox-overlay 제거
    if (overlay) {
        overlay.remove();
    }

    // 모든 image-piece 제거
    pieces.forEach(piece => {
        piece.remove();
    });
}