[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-ArcProgressStackView-blue.svg?style=flat-square)](http://android-arsenal.com/details/1/3308)

ArcProgressStackView
===================
Present your progress bars in arc mode with information and total control.

View size, CB controls     |Typeface, animation     |Draw width, offset, gradient   |Angle, orientation          |Shadow
:-------------------------:|:-------------------------:|:-------------------------:|:-------------------------:|:-------------------------:
![](https://lh3.googleusercontent.com/-5wahrBgdCTw/VuwHChXS3FI/AAAAAAAACNQ/eqpqhfnN5G0l3EnETDQ_I5qu4kqQYSysA/w327-h551-no/apsv_preview_size_cb.gif)|![](https://lh4.googleusercontent.com/-c6X1XyKY1go/VuwHCkNghpI/AAAAAAAACNQ/x_xtWAytFPkNrbuEDylIGKNR8mh1jW-rg/w323-h552-no/apsv_preview_typeface_animation.gif)|![](https://lh6.googleusercontent.com/-mz_x7ViHvpQ/VuwHCrwvy-I/AAAAAAAACNQ/vShu09gRxDYv1eekjOLDeSKoHMSluph3w/w325-h552-no/apsv_preview_offset.gif)|![](https://lh6.googleusercontent.com/-iuYi_G-OGrc/VuwHCgvlRNI/AAAAAAAACNQ/LNaGspht3gYsAMJfclfF9InQBzTamHj0Q/w325-h552-no/apsv_preview_angle.gif)|![](https://lh6.googleusercontent.com/-ifOq29FoVrE/VuwHCprAWrI/AAAAAAAACNQ/wLdEYiyV2kwd2rQDQf0QSMe-amHIbhogQ/w325-h552-no/apsv_preview_shadow.gif)

U can check the sample app [here](https://github.com/GIGAMOLE/ArcProgressStackView/tree/master/app).

Download
------------

You can download a .aar` from GitHub's [releases page](https://github.com/GIGAMOLE/ArcProgressStackView/releases).

Or use Gradle jCenter:

```groovy
dependencies {
    repositories {
        mavenCentral()
        maven {
            url  'http://dl.bintray.com/gigamole/maven/'
        }
    }
    compile 'com.github.gigamole.arcprogressstackview:library:+'
}
```

Or Gradle Maven Central:

```groovy
compile 'com.github.gigamole.arcprogressstackview:library:1.0.0'
```

Or Maven:
```xml
<dependency>
    <groupId>com.github.gigamole.arcprogressstackview</groupId>
    <artifactId>library</artifactId>
    <version>1.0.0</version>
    <type>aar</type>
</dependency>
```

Android SDK Version
=========
ArcProgressStackView requires a minimum sdk version of 8, but if you want animation and shadow support it requires a minimum sdk version of 11.

Sample
========

For APSV you can set such parameters as:

 - models:

    allows you to set APSV models, where you set title, progress and colors. Can be set up only via code.

 - animation:

    allows you to animate progress with func call or with touch event.

 - shadow:

    allows you to add shadow to your progress models, but remember, the shadow need LAYER_TYPE_SOFTWARE, so it decrease FPS.

 - round corners:

    allows you to set round corners to models.

 - drag/seek:

    allows you to make your progress model seek like.

 - typeface:

    allows you to set custom typeface.

 - text color:

    allows you to set text(title and progress indicator) color.

 - shadow distance:

    allows you to set shadow distance.

 - shadow angle:

    allows you to set shadow angle.

 - shadow radius:

     allows you to set shadow radius.

 - shadow color:

     allows you to set shadow color.

 - animation duration:

     allows you to set animation duration.

 - animation listener:

     allows you to set animation listener.

 - interpolator:

     allows you to set interpolator to animation.

 - draw width:

     allows you to set draw width in fraction mode(e.g. 55%) or dimension mode.

 - model offset:

     allows you to set model offset(positive or negative).

 - model background:

     allows you to set model background track from start angle to sweep angle.

 - start angle:

     allows you to set start angle of models.

 - sweep angle:

     allows you to set sweep angle of models.

 - progress indicator orientation:

     allows you to set progress indicator orientation.

 - preview colors:

     allows you to set preview colors, which generate count of models equals to count of colors.

 - preview background:

    allows you to set models background preview color.

All angle variables can only be positive and be in range from 0 to 360 degrees.

The size of view automatically set up in square mode.

Check out in code init:

```java
final ArrayList<ArcProgressStackView.Model> models = new ArrayList<>();
models.add(new ArcProgressStackView.Model("Circle", 25, bgColors[0], mStartColors[0]));
models.add(new ArcProgressStackView.Model("Progress", 50, bgColors[1], mStartColors[1]));
models.add(new ArcProgressStackView.Model("Stack", 75, bgColors[2], mStartColors[2]));
models.add(new ArcProgressStackView.Model("View", 100, bgColors[3], mStartColors[3]));

final ArcProgressStackView arcProgressStackView = (ArcProgressStackView) findViewById(R.id.apsv);
arcProgressStackView.setModels(models);
```

Other methods check out in sample.

And XML init:

```xml
<com.gigamole.samples.ArcProgressStackView
    android:id="@+id/apsv"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:apsv_rounded="true"
    app:apsv_shadowed="true"
    app:apsv_animated="true"
    app:apsv_dragged="true"
    app:apsv_typeface="fonts/agency.ttf"
    app:apsv_text_color="#fff"
    app:apsv_shadow_distance="5dp"
    app:apsv_shadow_angle="90"
    app:apsv_shadow_radius="10dp"
    app:apsv_shadow_color="#000"
    app:apsv_animation_duration="1000"
    app:apsv_interpolator="@android:anim/bounce_interpolator"
    app:apsv_draw_width="75%"
    app:apsv_model_offset="5dp"
    app:apsv_model_bg_enabled="true"
    app:apsv_start_angle="270"
    app:apsv_sweep_angle="360"
    app:apsv_indicator_orientation="vertical"
    app:apsv_preview_colors="@array/default_preview"
    app:apsv_preview_bg="#ccc"/>
```

Getting Help
======

To report a specific problem or feature request, [open a new issue on Github](https://github.com/GIGAMOLE/ArcProgressStackView/issues/new).

License
======

Apache 2.0. See LICENSE file for details.

Inspiration
======

[Here](https://www.behance.net/gallery/33128783/12-weeks-marathon-in-Sketch), [here](https://www.pinterest.com/pin/460915343094746684/), [here] (https://www.pinterest.com/pin/531424824760607320/), also [here] (https://www.pinterest.com/pin/149111437639569450/) and [here] (https://www.pinterest.com/pin/438538082442328565/)

Author
=======

Basil Miller - @gigamole
