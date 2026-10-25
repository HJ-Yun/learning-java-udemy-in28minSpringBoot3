import {useState} from "react";
import {useNavigate} from "react-router-dom";

export default LoginComponent

function LoginComponent(){

    const [username, setUsername] = useState('username')
    const [password, setPassword] = useState('')
    const [showSuccessMessage, setShowSuccessMessage] = useState(false)
    const [showErrorMessage, setShowErrorMessage] = useState(false)
    const navigate = useNavigate();

    function handleUsernameChange(event){
        console.log(event.target.value)
        setUsername(() => event.target.value)
    }

    function handlePasswordChange(event){
        console.log(event.target.value)
        setPassword(() => event.target.value)
    }

    function handleSubmit(){
        console.log(username);
        console.log(password);
        if (username === 'username' && password === '1234') {
            console.log('Login Success');
            setShowSuccessMessage(true);
            setShowErrorMessage(false);
            navigate(`/welcome/${username}`)
        } else {
            console.log('Login Failed');
            setShowSuccessMessage(false);
            setShowErrorMessage(true);
        }
    }

    function SuccessComponent() {
        if (showSuccessMessage) {
            return <div className="successMessage">Authenticated Successfully!</div>
        } else {
            return null
        }
    }

    function FailedComponent() {
        if (showErrorMessage) {
            return <div className="errorMessage">Authentication Failed!</div>
        } else {
            return null
        }
    }

    return (
        <div className="Login">
            <SuccessComponent />
            {showSuccessMessage && <div className="successMessage">Authenticated Successfully!</div>}
            <FailedComponent/>
            {showErrorMessage && <div className="errorMessage">Authentication Failed!</div>}
            <div className="LoginForm">
                <div>
                    <label>User Name</label>
                    <input type="text" name="username" value={username} onChange={handleUsernameChange}/>
                </div>
                <div>
                    <label>Password</label>
                    <input type="password" name="password" value={password} onChange={handlePasswordChange}/>
                </div>
                <div>
                    <button type="button" className="Login" onClick={handleSubmit}>
                        Login
                    </button>
                </div>
            </div>
        </div>
    )
}