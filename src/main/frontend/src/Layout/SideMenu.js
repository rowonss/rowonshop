import main_Logo from '../images/mainLogo.png'
import not_logged from "../Login_info/not_logged";
import search_button from "../images/search_button.png";


const SideMenu = () => {
    return (
        <div className="SideMenu">
            <div className="main_Logo"><a href="/"><img alt="main_Logo" src={main_Logo}/></a></div>
            <div className="main_logininfo">{not_logged()}</div>
            <div className="main_shopMenu">
                <div className="main_shopMenu_box">
                    <li><input className="search_text" type="text"/></li>
                    <li>
                        <button className="search_button"><img alt="search_button" src={search_button}/></button>
                    </li>
                </div>
            </div>
            <div className="main_Nav">
                <ul>
                    <li className="Main_Nav_head">Category</li>
                    <li></li>
                    <li>스티커</li>
                    <li>생활용품</li>
                    <li>스마트폰 관련</li>
                    <li>퍼즐</li>
                    <li>고객센터</li>
                </ul>
            </div>
        </div>
    )
}
export default SideMenu;