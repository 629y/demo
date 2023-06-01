## CSS动画

## CSS3 过渡

CSS3中，我们为了添加某种效果可以从一种样式转变到另一个样式的时候，无需使用Flash动画或JavaScript。

需要使用鼠标事件：hover

使用到的技术：

- 2D转换：  transform: scale(x ，y);  x代表水平缩放  y： 表示垂直缩放
- 过渡：transition 宽 高 时间   all代表所有 时间

用法：transition: all .4s

### 2 什么是动画

动画是可以设置多个节点类精确的控制一个或者是一组动画。

### 2.1 如何实现

-  先定义动画
- 在调整动画的效果，调用定义好的动画

### 2.2 语法

```css
@keyframes  动画名称{
0%{
  width ：100px
	}
100%{
	width ：100px
	}
}
div{
    /*调用动画*/
     animation-name: 动画名字
     /*持续时间*/
     animation-duration: 4s
}
```

案例：

```html
 <style>
        /*定义动画*/
        @keyframes move{
            0%{
                transform: translateX(0px);
            }
            100%{
                 transform: translateX(1000px);
            }
        }
        div{
            width: 200px;
            height: 200px;
            background-color: pink;
            /*调用动画*/
            animation-name: move;
             /*持续的时间*/
            animation-duration: 2s;
        }
    </style>
</head>
<body>
    <div></div>
</body>
```

### 2.3 动画的序列

0% -100% ：这就是规则

keyframes：规则内指定一个 CSS 样式和动画将逐步从目前的样式更改为新的样式。

也可以使用百分比来规定变化的发生的时间，等同与0%和100%

### 2.4 动画常见属性

| 属性                                                         | 描述                                                         | CSS  |
| :----------------------------------------------------------- | :----------------------------------------------------------- | :--- |
| [@keyframes](https://www.runoob.com/cssref/css3-pr-animation-keyframes.html) | 规定动画。                                                   | 3    |
| [animation](https://www.runoob.com/cssref/css3-pr-animation.html) | 所有动画属性的简写属性。                                     | 3    |
| [animation-name](https://www.runoob.com/cssref/css3-pr-animation-name.html) | 规定 @keyframes 动画的名称。                                 | 3    |
| [animation-duration](https://www.runoob.com/cssref/css3-pr-animation-duration.html) | 规定动画完成一个周期所花费的秒或毫秒。默认是 0。             | 3    |
| [animation-timing-function](https://www.runoob.com/cssref/css3-pr-animation-timing-function.html) | 规定动画的速度曲线。默认是 "ease"。                          | 3    |
| [animation-fill-mode](https://www.runoob.com/cssref/css3-pr-animation-fill-mode.html) | 规定当动画不播放时（当动画完成时，或当动画有一个延迟未开始播放时），要应用到元素的样式。 | 3    |
| [animation-delay](https://www.runoob.com/cssref/css3-pr-animation-delay.html) | 规定动画何时开始。默认是 0。                                 | 3    |
| [animation-iteration-count](https://www.runoob.com/cssref/css3-pr-animation-iteration-count.html) | 规定动画被播放的次数。默认是 1。                             | 3    |
| [animation-direction](https://www.runoob.com/cssref/css3-pr-animation-direction.html) | 规定动画是否在下一周期逆向地播放。默认是 "normal"。          | 3    |
| [animation-play-state](https://www.runoob.com/cssref/css3-pr-animation-play-state.html) | 规定动画是否正在运行或暂停。默认是 "running"。               | 3    |

属性案例：

```html
 <style>
  /*定义动画*/
        @keyframes move{
            0%{
                transform: translate(0px);
            }
            100%{
                 transform: translate(1000px,0);
            }
        }

  div{
             width: 200px;
            height: 200px;
            background-color: pink;
            /*调用动画*/
             animation-name: move;
             /*持续的时间*/
            animation-duration: 3s;
            /*运动曲线*/
            animation-timing-function: ease;

            /*动画结束后的状态，回到启始状态，forwards是停留在结束状态*/
            animation-fill-mode: forwards;
            /*何时开始动画*/
            animation-delay: 1s;
            /*规定重复的次数*/
            animation-iteration-count: infinite;
              /*回退过去*/
            animation-direction:alternate;
            /*简写方式*/
        animation: move 3s ease 2s infinite alternate forwards;
            /*name duration 必须要写*/

        animation: move 3s ease  forwards;
        }
 </style>
<body>
    <div></div>
</body>
```

**速度曲线：animation-timing-function** 属性

| 值                    | 描述                                                         | 测试                                                         |
| :-------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- |
| linear                | 动画从头到尾的速度是相同的。                                 | [测试](https://www.runoob.com/try/playit.php?f=animation-timing-function&preval=linear) |
| ease                  | 默认。动画以低速开始，然后加快，在结束前变慢。               | [测试](https://www.runoob.com/try/playit.php?f=animation-timing-function&preval=ease) |
| ease-in               | 动画以低速开始。                                             | [测试](https://www.runoob.com/try/playit.php?f=animation-timing-function&preval=ease-in) |
| ease-out              | 动画以低速结束。                                             | [测试](https://www.runoob.com/try/playit.php?f=animation-timing-function&preval=ease-out) |
| ease-in-out           | 动画以低速开始和结束。                                       | [测试](https://www.runoob.com/try/playit.php?f=animation-timing-function&preval=ease-in-out) |
| steps(int,start\|end) | 指定了时间函数中的间隔数量（步长）。有两个参数，第一个参数指定函数的间隔数，该参数是一个正整数（大于 0）。 第二个参数是可选的，表示动画是从时间段的开头连续还是末尾连续。含义分别如下：start：表示直接开始。end：默认值，表示戛然而止。 |                                                              |

```html
<style>
        @keyframes love{
            0%{
                left:0px;
            }
             50%{
                left:500px;
            }
            100%{
                left:0px;
            }
        }
        div{
            width: 100px;
            height: 100px;
            background-image: url("https://ecmb.bdimg.com/tam-ogel/790621563_811679593_2048_2048.jpg");
            background-size: 100px 100px;
            text-align: center;
            border-radius: 50%;
            border: 2px solid black;
            position: relative;
            animation-name: love;
            animation-duration: 2s;
            animation-iteration-count: infinite;
        }
        .one{
            animation-timing-function: ease;
        
        }
        .two{
            animation-timing-function: ease-in;
        }
        .three{
            animation-timing-function: ease-out;
        }
        .four{
            animation-timing-function: ease-in-out;
        }
    </style>
</head>
<body>
    <div class="one">ease</div>
    <div class="two">ease-in</div>
    <div class="three">ease-out</div>
    <div class="four">ease-in-out</div>
</body>
```

**奔跑的大熊：**`CSS/src/bear.html`

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>bear</title>
  <style>
    body{
        background: aliceblue;
        background: url("../media/bg1.png") no-repeat;
        background-size: 1600px;
    }
    div{
        background: url("../media/bear.png") no-repeat;
        position: absolute;
        width: 200px;
        height: 100px;
        animation: bear .4s steps(8) infinite alternate,move 3s infinite alternate;
        /*animation-name: bear;*/
        /*animation-delay: .4s;*/
        /*animation-iteration-count: infinite;*/
        /*animation-timing-function: steps(8);*/
        /*animation-direction: alternate;*/
    }
    @keyframes bear {
        0%{
            background-position: 0 0;
        }
        100%{
            background-position: -1600px 0;
        }
    }
    @keyframes move{
        0%{
            left: 0;
        }
        100%{
            left: 94%;
            transform: translateX(-50%);
        }
    }
  </style>
</head>
<body>
  <div></div>
</body>
</html>
```

**热点地图：**`CSS/src/maplighting.html`

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
  <style>
    body{
      background: #333;
    }
    .map{
      position: relative;
      width: 750px;
      height: 620px;
      background: url(../media/map.png) no-repeat;
      margin: 0 auto;
    }
    .city{
      position: absolute;
      top: 230px;
      right: 200px;
    }
    .tb{
      /*position: absolute;*/
      top: 500px;
      right: 85px;
    }
    .dotted{
      width: 8px;
      height: 8px;
      background-color: #09f;
      border-radius: 50%;
    }
    /*使用属性选择器 选择pulse开头的属性*/
    .city div[class^="pulse"]{
    /*.pulse1,.pulse2,.pulse3{*/
      /*保证我们的小波纹在父盒子里面水平居中，放大之后从中心向四周扩散*/
      position: absolute;
      top: 50%;
      left: 50%;
      transform: translate(-50%,-50%);
      width: 7px;
      height: 7px;
      box-shadow: 0 0 10px #009dfd;   /*向 div 元素添加阴影：*/
      border-radius: 50%;
      animation: pulse 1.2s linear infinite;
    }
    .city div.pulse2{
      animation-delay: .4s;
    }
    .city div.pulse3{
      animation-delay: .8s;
    }
    @keyframes pulse{
      0%{}
      70%{
        width: 40px;
        height: 40px;
        opacity: 1;  /*透明度*/
      }
      100%{
        width: 70px;
        height: 70px;
        opacity: 0;
      }
    }
  </style>
</head>
<body>
<div class="map">
  <div class="city">
    <div class="dotted"></div>
    <div class="pulse1"></div>
    <div class="pulse2"></div>
    <div class="pulse3"></div>
  </div>
  <div class="city tb">
    <div class="dotted"></div>
    <div class="pulse1"></div>
    <div class="pulse2"></div>
    <div class="pulse3"></div>
  </div>
</div>
</body>
</html>
```

**跳动的心：**`CSS/src/heartbeat.html`

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>heartbeat</title>
    <style>
        body{
            background: pink;
        }
        .all{
            position: relative;
            width: 400px;
            height: 300px;
            margin: 120px auto;
        }
        .left{
            width: 200px;
            height: 200px;
            border-radius: 65%;
            left: 30px;
        }
        .right{
            width: 200px;
            height: 200px;
            border-radius: 65%;
            right: 30px;
        }
        .bottom{
            width: 200px;
            height: 200px;
            border-radius: 10%;
            transform: rotate(45deg);
            bottom: 30px;
            left: 100px;
        }
        .left,.right,.bottom{
            position: absolute;
            box-shadow: 0 0 40px red;
            background: red;
            /*background: linear-gradient(-90deg,red 0%,red 100%);*/
            /*为三个子元素的背景做一个渐变的效果 ，-90deg为变轴 从开始浅色逐渐加深*/
            animation: beat 1s ease infinite;
        }
        .texts{
            text-align: center;
            font-size: 30px;
        }
        @keyframes beat {
            0%{
                transform:scale(1) rotate(315deg);
            }
            50%{
                transform:scale(1.3) rotate(315deg);
            }
            100%{
                transform:scale(1) rotate(315deg);
            }
            /* scale 表示对这个标签缩放
               rotate 盒子的旋转 旋转的度数 45° 135° 225° 315° 都是一样的心尖尖 */

        }
    </style>
</head>
<body>
<div class="all">
    <div class="left"></div>
    <div class="right"></div>
    <div class="bottom"></div>
</div>
<div class="texts">
    6.1儿童节快乐，我们还在成长的路上，喜欢糖果和气球
</div>
</body>
</html><style>
    body{
        background-color: pink;
    }
    .all{
        width: 400px;
        height: 300px;
        position: relative;  /*all 父元素*/
        top: 100px;           /*图像上下左右位置调整*/
        left: 40%;
    }
    .left{
        left: 30px;
        width: 200px;
        height: 200px;
        border-radius: 65%; /*调整左边盒子的弧度*/
    }
.right{
    right:30px;
    width: 200px;
    height: 200px;
    border-radius: 65%;
}
.bottom{
    bottom:30px;
    left: 100px;
    width: 200px;
    height: 200px;
    border-radius: 10%;
    transform: rotate(45deg); /*将下面的盒子旋转45度*/
}
.left , .right , .bottom{
    /*设置绝对路径*/
    position: absolute;
    /*设置盒子的阴影*/
    box-shadow: 0 0 40px orangered;
    animation: myanimation 1.5s ease infinite;
    background: linear-gradient(-90deg,orangered 0%,orangered 100%) ;
    /*为三个子元素的背景做一个渐变的效果 ，-90deg为变轴 从开始浅色逐渐加深*/
}
.texts{
    position: absolute;
    font-size: 30px;
    margin-left: 30%;
    margin-top: 150px;
}
@keyframes myanimation{

    0%{
        transform: scale(1) rotate(225deg);
    }
    50%{
        transform: scale(1.2) rotate(225deg);
    }
    100%{
        transform: scale(1) rotate(225deg);
    }
    /*
        scale 表示对这个标签缩放
        rotate 盒子的旋转 旋转的度数
    */
}
</style>
</head>
<body>
    <div class="all">
        <div class="left"></div>
        <div class="right"></div>
        <div class="bottom"></div>

    </div>
    <div class="texts">
        6.1儿童节快乐，我们还在成长的路上，喜欢糖果和气球

    </div>

```

## 3D旋转rotatex

3D旋转指的是：让元素在三维平面内沿着X Y Z轴或者自定义进行旋转

### 语法：

- transform：rotateX(45deg） --- 沿着X轴正方向旋转45度

- transform：rotateY(45deg)   ---沿着y轴正方向旋转45度
- transform：rotateZ(45deg)  --- 沿着Z轴正方向旋转45度
- transform：rotate3d(x,y,z,45deg)  ---沿着自定义轴旋转45度

**案例驱动**`CSS/src/rotate.html`

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>rotate</title>
  <style>
    div{
      /* 定义3D元素视图的距离  子元素获得透视效果 不是元素的本身*/
      perspective: 400px;
    }
    img{
      display: block;
      margin: 120px auto;
      transition: all 1s;
    }
    img:hover{
      /*沿着x轴旋转45度*/
      transform: rotateX(-45deg);
      /*transform: rotateY(180deg);*/
      /* transform: rotateZ(45deg); */
      /* transform: rotate3d(1,1,0,180deg);  沿着对角线旋转 180deg */
      /* transform: rotate3d(1,0,0,180deg);  沿着X轴线旋转 180deg
      transform: rotate3d(0,1,0,180deg); 沿着Y轴线旋转 180deg */
    }
  </style>
</head>
<body>
<div>
  <img src="../media/pig.jpg">
</div>
</body>
</html>
```

**翻转导航栏：**`CSS/src/navigation.html`

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>导航</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }
        ul{
            margin: 100px;
        }
        ul li{
            float: left;
            margin: 0 7px;
            width: 120px;
            height: 35px;
            list-style: none;
            perspective: 200px;
        }
        .box{
            position: relative;
            width: 100%;
            height: 100%;
            transform-style: preserve-3d;  /*保留3D的位置 */
            transition: all .4s;
        }
        .box:hover{
            transform: rotateX(90deg);
        }
        .front, .bottom{
            position: absolute;
            left: 0;
            top: 0;
            width: 100%;
            height: 100%;
        }
        .front{
            background-color: pink;
            z-index: 1;
            transform: translateZ(15px);
        }
        .bottom{
            background-color: darkkhaki;
            /*后面的需要沿着X轴进行显示 X轴必须是负数 如果有移动的样式 必须是先移动后旋转*/
            transform: translateY(15px) rotateX(-90deg);
        }
    </style>
</head>
<body>
<ul>
    <li>
        <div class="box">
            <div class="front">后院小树林</div>
            <div class="bottom">我在这等你</div>
        </div>
    </li>
    <li>
        <div class="box">
            <div class="front">后院小树林</div>
            <div class="bottom">我在这等你</div>
        </div>
    </li>
    <li>
        <div class="box">
            <div class="front">后院小树林</div>
            <div class="bottom">我在这等你</div>
        </div>
    </li>
    <li>
        <div class="box">
            <div class="front">后院小树林</div>
            <div class="bottom">我在这等你</div>
        </div>
    </li>
</ul>
</body>
</html>
```

**旋转木马：**`CSS/src/carousel.html`

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>旋转木马</title>
  <style>
    body{
      perspective: 1000px;
    }
    section{
      position: relative;
      width: 300px;
      height: 200px;
      margin: 150px auto;
      background: url("../media/pig.jpg") no-repeat;
      animation: rotate 5s linear infinite;
      transform-style: preserve-3d;
    }
    section:hover{
      animation-play-state: paused;
    }
    @keyframes rotate {
      0%{
        transform: rotateX(0);
      }
      100%{
        transform: rotateY(360deg);
      }
    }
    section div{
      position: absolute;
      width: 100%;
      height: 100%;
      background: url("../media/dog.jpg") no-repeat;
    }
    section div:nth-child(1) {
      transform: rotateY(0) translateZ(300px);
    }
    section div:nth-child(2){
      transform: rotateY(60deg) translateZ(300px);
    }
    section div:nth-child(3){
      transform: rotateY(120deg) translateZ(300px);
    }
    section div:nth-child(4){
      transform: rotateY(180deg) translateZ(300px);
    }
    section div:nth-child(5){
      transform: rotateY(240deg) translateZ(300px);
    }
    section div:nth-child(6){
      transform: rotateY(300deg) translateZ(300px);
    }

  </style>
</head>
<body>
  <section>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
  </section>
</body>
</html>
```

























