import main_Logo from '../images/mainLogo.png'

const header_main = () => {

    return (
        <div className="header_main">
            <div className="header_main_LogoAndInfo">
                <div className="header_main_LoginInfo"><a>로그인 정보</a></div>
                <div className="header_main_Logo"><a href="/"><img alt="main_Logo" src={main_Logo}/></a></div>
                <div className="header_main_ShopMenu"><a>샵 메뉴</a></div>
            </div>
        </div>
    )
}

export default header_main;