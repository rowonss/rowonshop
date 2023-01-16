import React, { useEffect, useState } from "react";
import DaumPostcode from "react-daum-postcode";
import '../post.css';

const Post = (props) => {

    const complete = (data) =>{
        let fullAddress = data.address;
        let addressCode = data.zonecode;
        let extraAddress = '';

        if (data.addressType === 'R') {
            if (data.bname !== '') {
                extraAddress += data.bname;
            }
            if (data.buildingName !== '') {
                extraAddress += (extraAddress !== '' ? `, ${data.buildingName}` : data.buildingName);
            }
            fullAddress += (extraAddress !== '' ? ` (${extraAddress})` : '');
            addressCode = data.zonecode;
        }

        props.setcompany({
            ...props.company,
            address:fullAddress,
            addressCode:addressCode
        })
    }

    return (
        <div >
            <DaumPostcode
                className="postmodal"
                autoClose
                onComplete={complete} />
        </div>
    );
};

export default Post;