# Android Activity Lifecycle Experiment 

I am going to use an experiment to explain the Android Activity lifecycle

Tools:  1 MainActivity, 1 ChildActivity, 2 Buttons and 1 UP button

 ![alt text](https://user-images.githubusercontent.com/24383706/29436686-ce54e4e8-837a-11e7-8fe4-aedcf595487a.JPG)
 ![alt text](https://user-images.githubusercontent.com/24383706/29436688-cf88035e-837a-11e7-932c-c90c1018d435.JPG)

### Step one: Launch App
```
* I/Main screen: onCreate
* I/Main screen: onStart
* I/Main screen: onResume

This stage will create the main screen and read to intercate with user
```
### Step Two: Click "OPEN CHILD ACTIVITY" button
```
* I/Main screen: onPause
* I/Child screen: onCreate
* I/Child screen: onStart
* I/Child screen: onResume
* I/Main screen: onStop

This stage main screen call onPause() method first, and call onStop() after child screen created.
I think it is becausethere only one UI thread and Android will solve the most important part first to avoid ANR
```
[ANR](https://developer.android.com/training/articles/perf-anr.html).


### Step Three: If Click "SAVE AND EXIT CHILD ACTIVITY" button or phone's "back" button
   where we call finish() method in the child activity
```
* I/Child screen: onPause
* I/Main screen: onStart
* I/Main screen: onResume
* I/Child screen: onStop
* I/Child screen: onDestroy

we can call finish() method or phone's "back" button in child activity to back to previous Activity 
(for example call finish() method to save pet data into database in Lesson 2: Using a Database in an Android App)
```

### Step Four: If we Click "[UP](https://developer.android.com/training/articles/perf-anr.html)" button at child screen
```
* I/Child screen: onPause
* I/Main screen: onDestroy
* I/Main screen: onCreate
* I/Main screen: onStart
* I/Main screen: onResume
* I/Child screen: onStop
* I/Child screen: onDestroy

There is a huge difference between "UP" button and phone's "back"button or call finish() method.
First, we use "UP" button to back to parent's activity, "back" button and finish() method to previous avtivity(page)
Second, "UP" button will make previous activity destory and recreate it again. 
So, when we need to update data for the previous activity,for example we update News URL after setting new 
preference in Networking lesson, we need to use "UP" Button or we can put method into onStart() method.

```

### Step Five: If we click pbone's home button at main screen
```
* I/Main screen: onPause
* I/Main screen: onStop

When we use phone's home button, the activity won'd destory but stay onStop stage which can be called again
like step six below
```

### Step Six: If we click app to go back
```
* I/Main screen: onStart
* I/Main screen: onResume
```
```
Note: During my studying process of Android Basics nano-degree in Udacity, and after debug some issues about loading or
updating data using non-UI thread. I created this experiment to help me learn the activity lifecycle. and will do this
again when come up with Fragment lifecycle.
```
