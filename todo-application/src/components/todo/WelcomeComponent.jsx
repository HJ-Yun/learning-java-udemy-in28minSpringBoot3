import {Link, useParams} from "react-router-dom";

export default WelcomeComponent

function WelcomeComponent() {

    const {username} = useParams();

    return (
        <div className="Welcome">
            <h1>Welcome Component</h1>
            <h2>{username}</h2>
            <div>
                <a href="/todos">A Tag Link</a>
            </div>
            <div>
                <Link to="/todos">React Link</Link>
            </div>
        </div>
    )
}