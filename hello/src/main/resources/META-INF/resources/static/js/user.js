#bars {
    height: 30px;
    left: 50%;
    margin: -30px 0 0 -20px;
    position: absolute;
    top: 50%;
    width: 40px;
}

.bar {
   background: #E20074;
    bottom: 1px;
    height: 30px;
    position: absolute;
    width: 3px;
    border-radius: 2px;
    animation: sound 0ms -800ms linear infinite alternate;
}

@keyframes sound {
    0% {
      opacity: .35;
      transform: scaleY(0.1)
    }
    100% {
        opacity: 1;
        transform: scaleY(1)
    }
}

.bar:nth-child(1)  { left: 1px; animation-duration: 474ms; }
.bar:nth-child(2)  { left: 5px; animation-duration: 433ms; }
.bar:nth-child(3)  { left: 9px; animation-duration: 407ms; }
.bar:nth-child(4)  { left: 13px; animation-duration: 458ms; }
.bar:nth-child(5)  { left: 17px; animation-duration: 400ms; }
.bar:nth-child(6)  { left: 21px; animation-duration: 427ms; }
.bar:nth-child(7)  { left: 25px; animation-duration: 441ms; }
.bar:nth-child(8)  { left: 29px; animation-duration: 419ms; }
.bar:nth-child(9)  { left: 33px; animation-duration: 487ms; }
.bar:nth-child(10) { left: 37px; animation-duration: 442ms; }