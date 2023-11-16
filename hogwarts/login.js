const btn = document.querySelector('.text-field-Btn');
const inputs = document.querySelectorAll('.text-field');
console.log(btn);
console.log(inputs[0]);
//id에 관한 규칙
// 8글자 이상
inputs[0].addEventListener('input',()=>{
    //password의 값이 있는지 체크
    let upw = inputs[1].value;
    if(upw.length > 7){
        let uid = inputs[0].value;
        if(uid.length > 7){
            btn.style.setProperty('background-color', 'rgb(101, 25, 25)');
            //btn.style.backgroundColor=값;
            //disabled 비활성화
            btn.disabled = false; //비활성화 안하겠다.
        }
    }else{
        btn.style.setProperty('background-color', '#aaa');
        btn.disabled = true; //비활성화 하겠다.
    }
});

//비밀번호체크
//8글자이상, 영어, 숫자, 특수문자 포함
///^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{8,}$/
inputs[1].addEventListener('input',()=>{
    let uid = inputs[0].value;
    if(uid.length > 7){
        let upw = inputs[1].value;
        //정규식 패턴 체크 과정
        //정규식 패턴에 일치하면 true, 아니면 false
        let reg = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{8,}$/.test(upw);
        console.log(upw, reg);
        if(reg){
            btn.style.setProperty('background-color', 'rgb(101, 25, 25)');
            //btn.style.backgroundColor=값;
            //disabled 비활성화
            btn.disabled = false; //비활성화 안하겠다. 
        }else{
            btn.style.setProperty('background-color', '#aaa');
            btn.disabled = true; //비활성화 하겠다.
        }
    }
});

document.getElementById('sudmitBtn').addEventListener('click', ()=>{
    window.location.href = "home.html";
});