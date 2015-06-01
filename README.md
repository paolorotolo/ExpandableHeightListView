# ExpandableHeightListView
Android Library to put a **ListView** inside a **ScrollView** without collapsing.

[![Maven Central](https://img.shields.io/badge/maven%20central-expandableheightlistview%3A1.0.0-brightgreen.svg)](http://search.maven.org/#artifactdetails|com.github.paolorotolo|expandableheightlistview|1.0.0|)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-ExpandableHeightListView-green.svg?style=flat)](https://android-arsenal.com/details/1/1919)


## How to use
Add this to your **build.gradle**:
```
repositories {
    mavenCentral()
}

dependencies {
  compile 'com.github.paolorotolo:expandableheightlistview:1.0.0'
}
```

Add ExpandableHeightListView instead of ListView in your **xml files**:

```
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

        <com.github.paolorotolo.expandableheightlistview.ExpandableHeightListView
            android:id="@+id/expandable_listview"
            android:layout_width="fill_parent"
            android:layout_height="wrap_content"
            android:padding="8dp">
        </com.github.paolorotolo.expandableheightlistview.ExpandableHeightListView>
</ScrollView>
```

Expand ExpandableHeightListView **programmatically**:
```
    ExpandableHeightListView expandableListView = (ExpandableHeightListView) findViewById(R.id.expandable_listview);
    
    expandableListView.setAdapter(adapterName);

    // This actually does the magic
    expandableListView.setExpanded(true);
```

It also works well with **GridView**.

Just use this instead:
```
<com.github.paolorotolo.expandableheightlistview.ExpandableHeightGridView
            android:id="@+id/expandable_listview"
            android:layout_width="fill_parent"
            android:layout_height="wrap_content"
            android:padding="8dp">
        </com.github.paolorotolo.expandableheightlistview.ExpandableHeightGridView>
```

## Example
See it in action: download **test .apk** [here](https://github.com/PaoloRotolo/ExpandableHeightListView/raw/master/ExpandableHeightListViewExample/app/app-release.apk).

Also check the example app's sources here on GitHub *(ExpandableHeightListViewExample)*.

##Wait, what?
Well, did you ever try to put a ListView inside a ScrollView?

**This is what happens.**

<img src="https://github.com/PaoloRotolo/ExpandableHeightListView/blob/master/art/default.png" width="500">

And this is what you can do with **ExpandableHeightListView**.

<img src="https://github.com/PaoloRotolo/ExpandableHeightListView/blob/master/art/expandable.png" width="500">


*Inspired by [this](http://stackoverflow.com/questions/20659696/scroll-feature-of-listview-within-scroll-view) answer on StackOverflow.*
