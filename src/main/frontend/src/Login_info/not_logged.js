import {Link} from "react-router-dom";


const not_logged = () => {
    return (
        <div>
            <br/>
            <p className="not_logged_massage">Not logging in</p>
            <ul className="not_logged">
                <li>로그인</li>
                <li>&nbsp;|&nbsp;</li>
                <li><Link to="/SignUp">회원가입</Link></li>
                <li>&nbsp;|&nbsp;</li>
                <li>계정찾기</li>
            </ul>
        </div>
    )
}

export default not_logged;