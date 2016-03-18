ArcProgressStackView
===================
Present your progress bars in arc mode with information and total control.

View size, CB controls     |Typeface, animation     |Draw width, offset, gradient   |Angle, orientation          |Shadow
:-------------------------:|:-------------------------:|:-------------------------:|:-------------------------:|:-------------------------:
![](https://lh3.googleusercontent.com/-5wahrBgdCTw/VuwHChXS3FI/AAAAAAAACNQ/eqpqhfnN5G0l3EnETDQ_I5qu4kqQYSysA/w327-h551-no/apsv_preview_size_cb.gif)|![](https://lh4.googleusercontent.com/-c6X1XyKY1go/VuwHCkNghpI/AAAAAAAACNQ/x_xtWAytFPkNrbuEDylIGKNR8mh1jW-rg/w323-h552-no/apsv_preview_typeface_animation.gif)|![](https://lh6.googleusercontent.com/-mz_x7ViHvpQ/VuwHCrwvy-I/AAAAAAAACNQ/vShu09gRxDYv1eekjOLDeSKoHMSluph3w/w325-h552-no/apsv_preview_offset.gif)|![](https://lh6.googleusercontent.com/-iuYi_G-OGrc/VuwHCgvlRNI/AAAAAAAACNQ/LNaGspht3gYsAMJfclfF9InQBzTamHj0Q/w325-h552-no/apsv_preview_angle.gif)|![](https://lh6.googleusercontent.com/-ifOq29FoVrE/VuwHCprAWrI/AAAAAAAACNQ/wLdEYiyV2kwd2rQDQf0QSMe-amHIbhogQ/w325-h552-no/apsv_preview_shadow.gif)

U can check the sample app [here](https://github.com/GIGAMOLE/ArcProgressStackView/tree/master/app).

Download
------------

You can download a .jar from GitHub's [releases page](https://github.com/GIGAMOLE/ArcProgressStackView/releases).

Or use Gradle jCenter:

    dependencies {
        repositories {
            mavenCentral()
            maven {
                url  'http://dl.bintray.com/gigamole/maven/'
            }
        }
        compile 'com.github.gigamole.arcprogressstackview:library:+'
    }

Or Gradle Maven Central:

    compile 'com.github.gigamole.arcprogressstackview:library:1.0.0'

Or Maven:

    <dependency>
	    <groupId>com.github.gigamole.arcprogressstackview</groupId>
	    <artifactId>library</artifactId>
	    <version>1.0.0</version>
	    <type>aar</type>
    </dependency>

Android SDK Version
=========
ArcProgressStackView requires a minimum sdk version of 8, but if you want animation and shadow support it requires a minimum sdk version of 11. 

Sample
========

You can set such parameters as:

 - colors:
 
    allows you to create shadow with transparent etc.
 - angle:
 
    allows you to set the angle of tint.

ArcProgressStackView must have child. Only one child.

The angle can only be positive and be in range from 0 to 360.

Check out in code init:

    final ArcProgressStackView tintLayout = (ArcProgressStackView) findViewById(R.id.tint_layout);
    tintLayout.setAngle(145);

And XML init:

    <com.gigamole.tintlayout.lib.ArcProgressStackView
        android:id="@+id/tint_layout"
        android:layout_width="300dp"
        android:layout_height="300dp"
        android:layout_gravity="center"
        android:background="@drawable/circle"
        libs:colors="@array/tint_layout_colors">

        <com.gigamole.tintlayout.AgencyTextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_gravity="center"
            android:gravity="center"
            android:text="@string/tint_layout_title"
            android:textColor="@color/white"
            android:textSize="50sp"
            libs:agencyFont="agency_bold" />

    </com.gigamole.tintlayout.lib.ArcProgressStackView>
    
If you want to look at circular tint animation just remove comment block in sample from XML and MainActivity.

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