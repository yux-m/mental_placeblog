window.onload = function(){
    
    //music list array
    var musicList = ['../templates/music/All the Colours.mp3',
    '../templates/music/Gentle Classical Piano Waltz.mp3',
    '../templates/music/Lost Balloon.mp3',
    '../templates/music/Morning Coffee and You.mp3',
    '../templates/music/Not the One to Say.mp3',
    '../templates/music/Now.mp3',
    '../templates/music/Soft Ripples.mp3',
    '../templates/music/Walk Tonight.mp3'];

    //music title on the top
    var musicTitle = ['All the Colours',
    'Gentle Classical Piano Waltz',
    'Lost Balloon',
    'Morning Coffee and You',
    'Not the One to Say',
    'Now',
    'Soft Ripples',
    'Walk Tonight'];

    //initialize
    var num = 2;

    //selector package
    function func(name){
        return document.querySelector(name);
    }

     //add music src
     func(".audio").src = musicList[num];

     //add music title
     func('.musicName').innerHTML = musicTitle[num];


    var audio = func(".audio");

     //start to play music
     func(".play").onclick = function(){
        
        if(audio.paused){//when paused, start the music
            audio.play();
        }
     };

     //puase the music
     func(".pause").onclick = function(){

        if(audio.played){//when played, paused the music
            audio.pause();
        }
     };

     
     //play package
     function initPlay(){
        //add music src
        func(".audio").src = musicList[num];

        //add music title
        func('.musicName').innerHTML = musicTitle[num];
     };
    

     //previous song
     func(".previous").onclick = function(){

        num--;
        
        if(num < 0){//if move to the first song, move back to the end of music list
            num = musicList.length - 1;
        }
        initPlay();//add music src and title name
        audio.play();//auto play when switch to the song

     };


    //next song
    func(".next").onclick = function(){

        num++;

        if(num == musicList.length){
            num = 0;
        }

        initPlay();//add music src and title name
        audio.play();

    };


    //volume
    var volume = func(".volume");

    //element audio has volume attribute and return the volume value of audio
    //can set the attribute volume by audio.volume
    volume.onchange = function(){
        audio.volume = volume.value;
    };

}
