import main_Logo from '../images/mainLogo.png'
import main_ShopMenu_cart from '../images/shopping-cart.png'
import main_ShopMenu_heart from '../images/heart.png'
import search_button from '../images/search_button.png'
import {Link} from "react-router-dom";

const header_main = () => {

    return (
        <div className="header_main">
            <div className="header_main_LogoAndInfo">
                <div className="header_main_LoginInfo"><a>로그인 정보</a></div>
                <div className="header_main_Logo"><a href="/"><img alt="main_Logo" src={main_Logo}/></a></div>
                <div className="header_main_ShopMenu">
                    <ul>
                        <li><input className="search_text" type="text"/></li>
                        <li><button className="search_button"><img alt="search_button" src={search_button}/></button></li>
                        <li><a href="/"><img alt="cart_image" src={main_ShopMenu_cart}/></a></li>
                        <li><a href="/"><img alt="heart" src={main_ShopMenu_heart}/></a></li>
                    </ul>
                </div>
            </div>
            <nav className="MainNav">
                <Link className="NavLink" to="/user">스티커</Link>
                <Link className="NavLink" to="/SignUp">사진</Link>
                <Link className="NavLink" to="/">스마트폰 용품</Link>
                <Link className="NavLink" to="/">생활용품</Link>
                <Link className="NavLink" to="/">고객센터</Link>
            </nav>
        </div>
    )
}

export default header_main;