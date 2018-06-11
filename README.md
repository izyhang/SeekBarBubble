# SeekBarBubble
[![Apache 2.0 License](https://img.shields.io/badge/license-Apache%202.0-blue.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0.html)

SeekBar滑动跟随气泡辅助

## LastVersion
`1.1.1`

## Delegate [![Download](https://api.bintray.com/packages/zyhang/maven/seekBarBubbleDelegate/images/download.svg) ](https://bintray.com/zyhang/maven/seekBarBubbleDelegate/_latestVersion)

以不侵入的思路为SeekBar增加气泡跟随，依赖SeekBar本身提供的OnSeekBarChangeListener

### Installation
```gradle
implementation 'com.zyhang:seekbarbubbledelegate:<LastVersion>'
```

### Usage
具体可以参考[MainActivity.kt](https://github.com/izyhang/SeekBarBubble/blob/master/app/src/main/java/com/zyhang/seekBarBubble/example/MainActivity.kt)
```kotlin
val seekBarBubbleDelegate = SeekBarBubbleDelegate(this,
                seekBar,
                LayoutInflater.from(this).inflate(R.layout.seekbar_bubble, null))
        with(seekBarBubbleDelegate) {
            setDefaultListener { _, progress, _ ->
                bubble.findViewById<TextView>(R.id.seekBar_bubble_tv).text = "$progress''"
            }
            // always show
            showBubble(true)
            bubble.findViewById<TextView>(R.id.seekBar_bubble_tv).text = "${seekBar.progress}''"
        }
```

## Kotlin 扩展 [ ![Download](https://api.bintray.com/packages/zyhang/maven/seekBarBubbleDelegate-kotlin/images/download.svg) ](https://bintray.com/zyhang/maven/seekBarBubbleDelegate-kotlin/_latestVersion)

### Installation
```gradle
implementation 'com.zyhang:seekbarbubbledelegate-kotlin:<LastVersion>'
```

## SeekBarBubble [![Download](https://api.bintray.com/packages/zyhang/maven/seekBarBubble/images/download.svg) ](https://bintray.com/zyhang/maven/seekBarBubble/_latestVersion)
继承SeekBar基于SeekBarBubbleDelegate提供的一款简单的气泡跟随SeekBar

### Screenshot
![](screenshot/1.png)

### Installation
```gradle
implementation 'com.zyhang:seekbarbubble:<LastVersion>'
```

### Usage
```xml
<com.zyhang.seekBarBubble.SeekBarBubble
            android:id="@+id/seekBarBubble"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_gravity="center"
            app:sbb_alwaysShow="true"/>
```