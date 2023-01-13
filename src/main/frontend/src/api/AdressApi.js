import {useEffect} from "react";


const AdressApi = () => {
    useEffect(()=>{
        const script = document.createElement("script");
        script.src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js";
        script.async = true;
        document.body.appendChild(script);
    });

    return <AdressApi/>;
}