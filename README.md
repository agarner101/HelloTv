# HelloTv
Simple Hello World Android application that shows the minimum necessities to run on an Android TV.

## Usage Guide
Instructions may vary by TV. Written for **Sony Bravia 4k 2015** on **Android 7.0**
#### 1. Enable ADB Debugging via Developer Options on TV.
1. Navigate to **Settings** then to **About**
2. Click repeatedly on **Build** until a success message appears
3. Navigate back to **Settings** then to **Developer Options**
4. Turn on **Enable developer options** and **ADB Debugging**

#### 2. Ensure that development machine and TV are on same network
#### 3. Find IP address of TV
1. Navigate to **Settings** then to **Network**
2. Select **Advanced Settings** then **Network Status**
3. Note **IP Address** on this page
#### 3. ADB Connect to TV
On your development machine:
1. Open Terminal
2. ```$ adb connect <Your-TV-IP>:5555```

To check if successful use ```$ adb devices``` and you should see:

```
List of devices attached
<Your-TV-IP>:5555	device
````
#### 4. Run project in Android Studio on TV

## Results:
![alt text](https://i.imgur.com/6PYbqCZ.png)
![alt text](https://i.imgur.com/F9jopv9.png)
