import React, {useEffect, useState} from 'react';
import {Routes, Route, Link} from "react-router-dom";
import axios from 'axios';
import Layout from "./Layout/Layout";

function App() {

    return(
        <div>
            <Layout>
            </Layout>
        </div>
    )


    // const [hello, setHello] = useState('')
    //
    // useEffect(() => {
    //   axios.get('/user')
    //       .then(response => setHello(response.data))
    //       .catch(error => console.log(error))
    // }, []);
    //
    // return (
    //     <div>
    //       리액트는 3306 포트로 동작하며 스프링부트의 톰캣을 통해 통해 8080포트로 최종적으로 보여지게 됩니다<br/>
    //         문자열 {hello} 은<br/>
    //          AWS RDS를 통해 생성해둔 mariaDB에서 가져 온 데이터 입니다
    //     </div>
    // );
}

export default App;