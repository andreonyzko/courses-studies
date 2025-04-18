const loginUser = (email, password, onSucess, onFail) => {
    setTimeout(() => {
        if(email != "andreonyzko@gmail.com"){
            onFail(new Error('Usuário inválido'));
            return;
        }
        onSucess(email)
    }, 1500);
}

const getVideos = (user, callback) => {
    let videos = ['video1', 'video2', 'video3'];
    callback(videos);
}

const getVideoDetails = (video, callback) => {
    let video_title = `${video}: Curso de JavaScript`
    callback(video_title);
}

const user = loginUser('andreonyzko@gmail.com', 
    '123456', 
    (user) => {
        console.log(`User logged: ${user}`);
        getVideos(user, (videos) =>{
            console.log({videos});
            getVideoDetails(videos[0], (video_title) => {
                console.log({video_title});
            })
        })
    }, 
    (error) => {
        console.log({error});
    }
)

