import AdressApi from "../api/AdressApi"
import {useEffect, useState} from "react";
import axios from "axios";
import DaumPostcode from 'react-daum-postcode';
import Post from "./Post";

const SignUp = () => {

    const [userid, setuserid] = useState("");

    const onChangeuserid = (e) => {
        setuserid(e.target.value)
    }

    const [userpassword, setuserpassword] = useState("");

    const onChangeuserpassword = (e) => {
        setuserpassword(e.target.value)
    }

    const [userpassworcon, setuserpasswordcon] = useState("");

    const onChangeuserpasswordcon = (e) => {
        setuserpasswordcon(e.target.value)
    }

    const userpassisconf = () =>{
        if(userpassword.length===0){
            setuserpassiscon("비밀번호를 입력 해주세요")
        }
        else if(userpassword.toString() === userpassworcon.toString()){
            setuserpassiscon("비밀번호가 일치 합니다")
        }
        else {
            setuserpassiscon("비밀번호가 일치 하지 않습니다")
        }
    }

    useEffect(()=>{
        userpassisconf()
    },[userpassworcon,userpassword])

    const [userpassiscon, setuserpassiscon] = useState("");

    const [username, setusername] = useState("");

    const onChangeusername = (e) => {
        setusername(e.target.value)
    }

    const [usernickname, setusernickname] = useState("");

    const onChangeusernickname = (e) => {
        setusernickname(e.target.value)
    }

    const [email, setemail] = useState("");

    const onChangeemail = (e) => {
        setemail(e.target.value)
    }

    const [useraddressSub, setuseraddressSub] = useState("");

    const onChangeuseraddressSub = (e) => {
        setuseraddressSub(e.target.value)
    }

    const [AuthNum, setAuthNum] = useState("");

    const [userAuthNum, usersetAuthNum] = useState("");

    const onChangeuserAuthNum = (e) => {
        usersetAuthNum(e.target.value)
    }

    const SignUp = () => {
        if(!userIdConfirmed){
            return alert("아이디 중복확인을 해주세요")
        }
        if(!AuthConfirmed){
            return alert("이메일 인증을 확인 해주세요")
        }
        axios.post('/userSignUp', null, {
            params: {
                userId: userid,
                userPassword: userpassword,
                userName: username,
                userNickname: usernickname,
                userEmail: email,
                useraddressMain: enroll_company.address,
                useraddressSub: useraddressSub,
                useraddressCode: enroll_company.addressCode
            }
        })
            .then(res => {
                console.log(res.data)
                alert("회원 가입이 완료 되었습니다")
                document.location.href = '/'
            })
            .catch(function (error) {
                console.log("안 돼")
                console.log(error);
            })
    }

    const [userIdConfirmed, setuserIdConfirmed] = useState(false);

    const userIdcontains = () => {
        axios.post('/userIdContains',null,{
            params:{
                userId: userid
            }
        })
            .then(res => {
                console.log(res.data)
                if(res.data){
                    setuserIdConfirmed(true)
                    alert("사용 가능한 아이디 입니다")
                }
                else{
                    setuserIdConfirmed(false)
                    alert("이미 사용중인 아이디 입니다")
                }
            })
            .catch(function (error) {
                console.log(error);
            })
    }

    const sendmail = () => {
        axios.post('/sendmail',null,{
            params:{
                address:email
            }
        })
            .then(res => {
                if(res.data.toString() === "false"){
                    alert("이미 등록된 이메일 입니다")
                }
                else {
                    alert("메일 전송 완료.")
                    setAuthNum(res.data)
                }
            })
            .catch(function (error) {
                console.log(error);
            })
    }

    const [AuthConfirmed, setAuthConfirmed] = useState(false);

    const AuthCheck = () => {
        if(AuthNum === userAuthNum){
            alert("일치합니다")
            setAuthConfirmed(true)
        }
        else {
            alert("불일치")
        }
    }

    const [enroll_company, setEnroll_company] = useState({
        address:'',
        addressCode:''
    });

    const [popup, setPopup] = useState(false);

    const handleInput = (e) => {
        setEnroll_company({
            ...enroll_company,
            [e.target.name]:e.target.value,
        })
    }

    const handleComplete = (data) => {
        setPopup(!popup);
    }

    return (
            <div className="SignUp_box">
                <ul>
                    <li><input type="text" placeholder="사용하실 아이디를 입력 해주세요" onChange={onChangeuserid}/><button onClick={userIdcontains}>중복 확인</button></li>
                    <li><input type="password" placeholder="사용하실 비밀번호를 입력 해주세요" onChange={onChangeuserpassword}/></li>
                    <li><input type="password" placeholder="비밀번호 확인" onChange={onChangeuserpasswordcon}/>{userpassiscon}</li>
                    <li><input type="text" placeholder="성함을 입력 해주세요" onChange={onChangeusername}/></li>
                    <li><input type="text" placeholder="닉네임을 입력 해주세요" onChange={onChangeusernickname}/></li>
                    <li><input type="text" placeholder="이메일을 입력 해주세요" onChange={onChangeemail}/><button onClick={sendmail}>이메일 인증번호 전송</button></li>
                    <li><input type="text" placeholder="인증번호를 입력 해주세요" onChange={onChangeuserAuthNum}/><button onClick={AuthCheck}>인증번호 확인</button></li>
                    <li><div><input className="postCode" type="text" placeholder="우편번호" value={enroll_company.addressCode}/></div><input type="text" placeholder="주소" value={enroll_company.address} onClick={handleComplete}/></li>
                    {popup && <Post company={enroll_company} setcompany={setEnroll_company}></Post>}
                    <li><input type="text" placeholder="상세 주소" onChange={onChangeuseraddressSub}/></li>
                    <li>
                        <button onClick={SignUp}>회원 가입</button>
                    </li>
                </ul>
            </div>
    )
}
export default SignUp;