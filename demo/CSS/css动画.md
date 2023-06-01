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

**奔跑的大熊：**

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

