function startGame() {

}


function endGame() {

}

function answerCheck() {
    document.getElementById('AFirst').value = 2;
    document.getElementById('ASecond').value = 7;
    document.getElementById('AThird').value = 3
    document.getElementById('AFourth').value = 0;
}

function input0() {
    let check0 = document.getElementById('check0').checked;
    let iFirst = document.getElementById('iFirst').value;
    let iSecond = document.getElementById('iSecond').value
    let iThird = document.getElementById('iThird').value;
    let iFourth = document.getElementById('iFourth').value;
    if(check0==true) {
        alert("사용 불가로 지정한 값은 넣을 수 없습니다. 체크를 해제해 주십시오.")
    } else if(iFirst=="") {
        alert("첫 값에는 0을 넣을 수 없습니다.")
    } else if(iSecond=="0" || iThird=="0" || iFourth=="0") {
        alert("중복값이 있으므로 넣을 수 없습니다.")
    } else if(iSecond=="") {
        document.getElementById('iSecond').value = "0";
    } else if(iThird=="") {
        document.getElementById('iThird').value = "0";
    } else if(iFourth=="") {
        document.getElementById('iFourth').value = "0";
    }
}

function input1() {
    let check1 = document.getElementById('check1').checked;
    let iFirst = document.getElementById('iFirst').value;
    let iSecond = document.getElementById('iSecond').value
    let iThird = document.getElementById('iThird').value;
    let iFourth = document.getElementById('iFourth').value;
    if(check1==true) {
        alert("사용 불가로 지정한 값은 넣을 수 없습니다. 체크를 해제해 주십시오.")
    } else if(iFirst=="1" || iSecond=="1" || iThird=="1" || iFourth=="1") {
        alert("중복값이 있으므로 넣을 수 없습니다.")
    } else if(iFirst=="") {
        document.getElementById('iFirst').value = "1";
    } else if(iSecond=="") {
        document.getElementById('iSecond').value = "1";
    } else if(iThird=="") {
        document.getElementById('iThird').value = "1";
    } else if(iFourth=="") {
        document.getElementById('iFourth').value = "1";
    }
}

function input2() {
    let check2 = document.getElementById('check2').checked;
    let iFirst = document.getElementById('iFirst').value;
    let iSecond = document.getElementById('iSecond').value
    let iThird = document.getElementById('iThird').value;
    let iFourth = document.getElementById('iFourth').value;
    if(check2==true) {
        alert("사용 불가로 지정한 값은 넣을 수 없습니다. 체크를 해제해 주십시오.")
    } else if(iFirst=="2" || iSecond=="2" || iThird=="2" || iFourth=="2") {
        alert("중복값이 있으므로 넣을 수 없습니다.")
    } else if(iFirst=="") {
        document.getElementById('iFirst').value = "2";
    } else if(iSecond=="") {
        document.getElementById('iSecond').value = "2";
    } else if(iThird=="") {
        document.getElementById('iThird').value = "2";
    } else if(iFourth=="") {
        document.getElementById('iFourth').value = "2";
    }
}

function input3() {
    let check3 = document.getElementById('check3').checked;
    let iFirst = document.getElementById('iFirst').value;
    let iSecond = document.getElementById('iSecond').value
    let iThird = document.getElementById('iThird').value;
    let iFourth = document.getElementById('iFourth').value;
    if(check3==true) {
        alert("사용 불가로 지정한 값은 넣을 수 없습니다. 체크를 해제해 주십시오.")
    } else if(iFirst=="3" || iSecond=="3" || iThird=="3" || iFourth=="3") {
        alert("중복값이 있으므로 넣을 수 없습니다.")
    } else if(iFirst=="") {
        document.getElementById('iFirst').value = "3";
    } else if(iSecond=="") {
        document.getElementById('iSecond').value = "3";
    } else if(iThird=="") {
        document.getElementById('iThird').value = "3";
    } else if(iFourth=="") {
        document.getElementById('iFourth').value = "3";
    }
}

function input4() {
    let check4 = document.getElementById('check4').checked;
    let iFirst = document.getElementById('iFirst').value;
    let iSecond = document.getElementById('iSecond').value
    let iThird = document.getElementById('iThird').value;
    let iFourth = document.getElementById('iFourth').value;
    if(check4==true) {
        alert("사용 불가로 지정한 값은 넣을 수 없습니다. 체크를 해제해 주십시오.")
    } else if(iFirst=="4" || iSecond=="4" || iThird=="4" || iFourth=="4") {
        alert("중복값이 있으므로 넣을 수 없습니다.")
    } else if(iFirst=="") {
        document.getElementById('iFirst').value = "4";
    } else if(iSecond=="") {
        document.getElementById('iSecond').value = "4";
    } else if(iThird=="") {
        document.getElementById('iThird').value = "4";
    } else if(iFourth=="") {
        document.getElementById('iFourth').value = "4";
    }
}

function input5() {
    let check5 = document.getElementById('check5').checked;
    let iFirst = document.getElementById('iFirst').value;
    let iSecond = document.getElementById('iSecond').value
    let iThird = document.getElementById('iThird').value;
    let iFourth = document.getElementById('iFourth').value;
    if(check5==true) {
        alert("사용 불가로 지정한 값은 넣을 수 없습니다. 체크를 해제해 주십시오.")
    } else if(iFirst=="5" || iSecond=="5" || iThird=="5" || iFourth=="5") {
        alert("중복값이 있으므로 넣을 수 없습니다.")
    } else if(iFirst=="") {
        document.getElementById('iFirst').value = "5";
    } else if(iSecond=="") {
        document.getElementById('iSecond').value = "5";
    } else if(iThird=="") {
        document.getElementById('iThird').value = "5";
    } else if(iFourth=="") {
        document.getElementById('iFourth').value = "5";
    }
}

function input6() {
    let check6 = document.getElementById('check6').checked;
    let iFirst = document.getElementById('iFirst').value;
    let iSecond = document.getElementById('iSecond').value
    let iThird = document.getElementById('iThird').value;
    let iFourth = document.getElementById('iFourth').value;
    if(check6==true) {
        alert("사용 불가로 지정한 값은 넣을 수 없습니다. 체크를 해제해 주십시오.")
    } else if(iFirst=="6" || iSecond=="6" || iThird=="6" || iFourth=="6") {
        alert("중복값이 있으므로 넣을 수 없습니다.")
    } else if(iFirst=="") {
        document.getElementById('iFirst').value = "6";
    } else if(iSecond=="") {
        document.getElementById('iSecond').value = "6";
    } else if(iThird=="") {
        document.getElementById('iThird').value = "6";
    } else if(iFourth=="") {
        document.getElementById('iFourth').value = "6";
    }
}

function input7() {
    let check7 = document.getElementById('check7').checked;
    let iFirst = document.getElementById('iFirst').value;
    let iSecond = document.getElementById('iSecond').value
    let iThird = document.getElementById('iThird').value;
    let iFourth = document.getElementById('iFourth').value;
    if(check7==true) {
        alert("사용 불가로 지정한 값은 넣을 수 없습니다. 체크를 해제해 주십시오.")
    } else if(iFirst=="7" || iSecond=="7" || iThird=="7" || iFourth=="7") {
        alert("중복값이 있으므로 넣을 수 없습니다.")
    } else if(iFirst=="") {
        document.getElementById('iFirst').value = "7";
    } else if(iSecond=="") {
        document.getElementById('iSecond').value = "7";
    } else if(iThird=="") {
        document.getElementById('iThird').value = "7";
    } else if(iFourth=="") {
        document.getElementById('iFourth').value = "7";
    }
}

function input8() {
    let check8 = document.getElementById('check8').checked;
    let iFirst = document.getElementById('iFirst').value;
    let iSecond = document.getElementById('iSecond').value
    let iThird = document.getElementById('iThird').value;
    let iFourth = document.getElementById('iFourth').value;
    if(check8==true) {
        alert("사용 불가로 지정한 값은 넣을 수 없습니다. 체크를 해제해 주십시오.")
    } else if(iFirst=="8" || iSecond=="8" || iThird=="8" || iFourth=="8") {
        alert("중복값이 있으므로 넣을 수 없습니다.")
    } else if(iFirst=="") {
        document.getElementById('iFirst').value = "8";
    } else if(iSecond=="") {
        document.getElementById('iSecond').value = "8";
    } else if(iThird=="") {
        document.getElementById('iThird').value = "8";
    } else if(iFourth=="") {
        document.getElementById('iFourth').value = "8";
    }
}

function input9() {
    let check9 = document.getElementById('check9').checked;
    let iFirst = document.getElementById('iFirst').value;
    let iSecond = document.getElementById('iSecond').value
    let iThird = document.getElementById('iThird').value;
    let iFourth = document.getElementById('iFourth').value;
    if(check9==true) {
        alert("사용 불가로 지정한 값은 넣을 수 없습니다. 체크를 해제해 주십시오.")
    } else if(iFirst=="9" || iSecond=="9" || iThird=="9" || iFourth=="9") {
        alert("중복값이 있으므로 넣을 수 없습니다.")
    } else if(iFirst=="") {
        document.getElementById('iFirst').value = "9";
    } else if(iSecond=="") {
        document.getElementById('iSecond').value = "9";
    } else if(iThird=="") {
        document.getElementById('iThird').value = "9";
    } else if(iFourth=="") {
        document.getElementById('iFourth').value = "9";
    }
}

function submit() {
    const answer = startGame.number;
    const Inumber = {
        first: document.getElementById('iFirst').value,
        second: document.getElementById('iSecond').value,
        third: document.getElementById('iThird').value,
        fourth: document.getElementById('iFourth').value,
        fullNumber: function() {
            return this.first+this.second+this.third+this.fourth
        }  
    }
    document.getElementById("demo").innerHTML = Inumber.fullNumber();
    document.getElementById('iFirst').value = "",
    document.getElementById('iSecond').value = "",
    document.getElementById('iThird').value = "",
    document.getElementById('iFourth').value = ""
}