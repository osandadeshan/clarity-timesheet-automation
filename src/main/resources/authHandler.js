const username = "onimalarat@abc.com";
const password = "password@123";
let retry = 3;

chrome.webRequest.onAuthRequired.addListener(
    function handler(details) {
        if (--retry < 0)
            return {cancel: true};
        return {authCredentials: {username: username, password: password}};
    },
    {urls: ["<all_urls>"]},
    ['blocking']
);