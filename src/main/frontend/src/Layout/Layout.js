import {BrowserRouter, Route, Routes} from "react-router-dom";
import SignUp from "../User_SignUp/SignUp"
import SideMenu from "./SideMenu";
import home_page from "../shop_page/home_page";

const Layout = () => {
    return (
        <div className="Main_box">
            <SideMenu/>
            <div className="Main_form">
                <Routes>
                    <Route path="/" element={home_page()}/>
                    <Route path="/SignUp" element={SignUp()}/>
                </Routes>
            </div>
        </div>
    )
}

export default Layout;