ArcProgressStackView
====================

Present your progress bars in arc mode with information and total control.

[![DevLight](https://lh4.googleusercontent.com/-9btnRFp_eVo/V5cfwZsBpMI/AAAAAAAAC4E/s4NGoezKhpAVdVofAoez1QWpzK5Na8_cQCL0B/w147-h20-no/devlight-badge.png)](http://devlight.com.ua)

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-ArcProgressStackView-yellow.svg?style=flat)](http://android-arsenal.com/details/1/3308)
[![Android](https://img.shields.io/badge/platform-android-brightgreen.svg?style=flat&label=Platform)](https://github.com/DevLight-Mobile-Agency)
[![Download](https://api.bintray.com/packages/gigamole/maven/arcprogressstackview/images/download.svg)](https://bintray.com/gigamole/maven/arcprogressstackview/_latestVersion)
[![Crates.io](https://img.shields.io/crates/l/rustc-serialize.svg?maxAge=2592000&label=License)](https://github.com/DevLight-Mobile-Agency/ArcProgressStackView/blob/master/LICENSE.txt)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/cc3e2c54db41455e83228d9db0803fae)](https://www.codacy.com/app/gigamole53/ArcProgressStackView?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=DevLight-Mobile-Agency/ArcProgressStackView&amp;utm_campaign=Badge_Grade)

|    |    |    |    |    |
:-------------------------:|:-------------------------:|:-------------------------:|:-------------------------:|:-------------------------:
![](https://lh3.googleusercontent.com/-5wahrBgdCTw/VuwHChXS3FI/AAAAAAAACNQ/eqpqhfnN5G0l3EnETDQ_I5qu4kqQYSysA/w327-h551-no/apsv_preview_size_cb.gif)|![](https://lh4.googleusercontent.com/-c6X1XyKY1go/VuwHCkNghpI/AAAAAAAACNQ/x_xtWAytFPkNrbuEDylIGKNR8mh1jW-rg/w323-h552-no/apsv_preview_typeface_animation.gif)|![](https://lh6.googleusercontent.com/-mz_x7ViHvpQ/VuwHCrwvy-I/AAAAAAAACNQ/vShu09gRxDYv1eekjOLDeSKoHMSluph3w/w325-h552-no/apsv_preview_offset.gif)|![](https://lh6.googleusercontent.com/-iuYi_G-OGrc/VuwHCgvlRNI/AAAAAAAACNQ/LNaGspht3gYsAMJfclfF9InQBzTamHj0Q/w325-h552-no/apsv_preview_angle.gif)|![](https://lh6.googleusercontent.com/-ifOq29FoVrE/VuwHCprAWrI/AAAAAAAACNQ/wLdEYiyV2kwd2rQDQf0QSMe-amHIbhogQ/w325-h552-no/apsv_preview_shadow.gif)

You can check the sample app [here](https://github.com/DevLight-Mobile-Agency/ArcProgressStackView/tree/master/app).

Download
------------

You can download a `.aar` from GitHub's [releases page](https://github.com/DevLight-Mobile-Agency/ArcProgressStackView/releases).

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
compile 'com.github.gigamole.arcprogressstackview:library:1.0.3'
```

Or Maven:

```xml
<dependency>
    <groupId>com.github.gigamole.arcprogressstackview</groupId>
    <artifactId>library</artifactId>
    <version>1.0.3</version>
    <type>aar</type>
</dependency>
```

Android SDK Version
===================

`ArcProgressStackView` requires a minimum SDK version of 8, but if you want animation and shadow support it requires a minimum SDK version of 11.

Sample
======

<b>Parameters</b>

For `APSV` you can set such parameters as:

 - models:

    allows you to set `APSV` models, where you set title, progress and colors. Can be set up only via code.

 - animation:

    allows you to animate progress with func call or with touch event.

 - shadow:

    allows you to add shadow to your progress models, but remember, the shadow need `LAYER_TYPE_SOFTWARE`, so it decrease FPS.

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

<b>Tips</b>

All angle variables can only be positive and be in range from 0 to 360 degrees.

The size of `View` automatically set up in square mode.

<b>Init</b>

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

To report a specific problem or feature request, [open a new issue on Github](https://github.com/DevLight-Mobile-Agency/ArcProgressStackView/issues/new).

License
======
Apache 2.0 and MIT. See [LICENSE](https://github.com/DevLight-Mobile-Agency/ArcProgressStackView/blob/master/LICENSE.txt) file for details.

Inspiration
======

|   	|   	|   	|   	|
|:-:	|:-:	|:-:	|:-:	|
![](https://lh5.googleusercontent.com/-7BVqroskfPs/V5dtQZVAlhI/AAAAAAAAC4c/PXf2UAkDhxQVJhF96wSXyi-L52gejAN_ACL0B/w304-h530-no/apsv.png)|![](https://d13yacurqjgara.cloudfront.net/users/124059/screenshots/1926158/attachments/352243/shot.gif)|![](https://s-media-cache-ak0.pinimg.com/564x/47/82/e0/4782e07bd49cc2d1d19f73ff5735a1ea.jpg)|![](https://d13yacurqjgara.cloudfront.net/users/107759/screenshots/2060933/awuikit.gif)

Author
=======

Made in [DevLight Mobile Agency](https://github.com/DevLight-Mobile-Agency)

Created by [Basil Miller](https://github.com/GIGAMOLE) - [@gigamole](mailto:gigamole53@gmail.com)
