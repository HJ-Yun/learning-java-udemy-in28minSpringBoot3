import './TodoApp.css'
import {BrowserRouter, Route, Routes} from "react-router-dom";

import FooterComponent from "./FooterComponent";
import LogoutComponent from "./LogoutComponent";
import HeaderComponent from "./HeaderComponent";
import ListComponent from "./ListComponent";
import ErrorComponent from "./ErrorComponent";
import WelcomeComponent from "./WelcomeComponent";
import LoginComponent from "./LoginComponent";
import AuthProvider from "./security/AuthContext";

export default function TodoApp(){
    return(
        <div className="TodoApp">
            <AuthProvider>
                <BrowserRouter>
                    <HeaderComponent/>
                    <Routes>
                        <Route path='/' element={<LoginComponent />} />
                        <Route path='/login' element={<LoginComponent />} />
                        <Route path='/welcome/:username' element={<WelcomeComponent />} />
                        <Route path='/todos' element={<ListComponent />} />
                        <Route path='/logout' element={<LogoutComponent />} />
                        <Route path='*' element={<ErrorComponent />}></Route>
                    </Routes>
                    <FooterComponent/>
                </BrowserRouter>
                {/*<LoginComponent/>*/}
                {/*<WelcomeComponent/>*/}
            </AuthProvider>
        </div>
    )
}