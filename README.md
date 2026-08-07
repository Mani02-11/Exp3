# 📱 Android Lab Experiment 3 – Fragments and Debugging

A simple Android application developed using **Android Studio** and **Kotlin** as part of the **Mobile Application Development Lab**. The application demonstrates the use of **Fragments** to create a flexible user interface. The first Fragment displays a list of computer science courses, while the second Fragment displays detailed information about the selected course. The project also demonstrates Android Studio debugging using **Normal Breakpoints** and **Conditional Breakpoints**.

---

## 👨‍💻 Author

**Name:** Manikandan P  
**USN:** 25MCAR0186  
**Subject:** Mobile Application Development Lab

---

## 🚀 Features

- Uses Android Fragments
- Displays a list of courses
- Shows detailed information about the selected course
- Supports Fragment navigation
- Demonstrates Fragment lifecycle
- Implements Normal Breakpoints
- Implements Conditional Breakpoints
- Built using Kotlin and Android Studio

---

## 📚 Concept

Fragments are reusable portions of an Activity's user interface. They allow applications to create flexible layouts that adapt to different screen sizes. This application uses two Fragments:

- **ListFragment** – Displays a list of available courses.
- **DetailFragment** – Displays detailed information about the selected course.

The project also demonstrates Android Studio's debugging tools by using **Normal Breakpoints** and **Conditional Breakpoints** to inspect variables, lifecycle methods, and the call stack.

---

## 🧪 Scenario Demonstrated

The application displays a list of computer science courses. When the user selects a course, the corresponding details are displayed in the Detail Fragment. During execution, the application is run in **Debug Mode** to observe Fragment creation, variable values, and breakpoint behavior.

---

## 🛠️ Technologies Used

- Android Studio
- Kotlin
- XML
- Android SDK
- Fragments
- Android Debugger

---

## 📂 Project Structure

```text
app
├── manifests
│   └── AndroidManifest.xml
├── kotlin+java
│   └── com.example.exp3
│       ├── MainActivity.kt
│       ├── ListFragment.kt
│       └── DetailFragment.kt
├── res
│   ├── drawable
│   ├── layout
│   │   ├── activity_main.xml
│   │   ├── fragment_list.xml
│   │   └── fragment_detail.xml
│   ├── mipmap
│   ├── values
│   └── xml
└── Gradle Scripts
```


## ▶️ Debugging

### Normal Breakpoint

A breakpoint is placed in **DetailFragment.kt** to inspect:

- Fragment Lifecycle
- Local Variables
- Call Stack

The debugger pauses every time a course is selected.

### Conditional Breakpoint

A conditional breakpoint is placed in **ListFragment.kt** with the condition:

```kotlin
selectedCourse == "Android"
```

The debugger pauses only when **Android** is selected.

---

## ✅ Test Cases

### Test Case 1: Application Launch

**Objective:** Verify that the application launches successfully and displays the list of courses.

**Expected Result:**

- The application opens without errors.
- The course list is displayed.
- The heading **Course Explorer** is visible.

**Screenshot:** `screenshots/testcase1.png`

---

### Test Case 2: Course Selection

**Objective:** Verify that selecting a course displays the corresponding details in the Detail Fragment.

**Expected Result:**

- The selected course title is displayed.
- The course description, duration, topics covered, and career roles are displayed correctly.
- The Detail Fragment loads successfully.

**Screenshot:** `screenshots/testcase2.png`

---

### Test Case 3: Verify Student Details

**Objective:** Verify that the main screen displays the student's Name and USN correctly.

**Expected Result:**

- Name: **Manikandan P**
- USN: **25MCAR0186**
- Name and USN are displayed at the bottom-center of the main screen.
- The application functions correctly after displaying the student details.

**Screenshot:** `screenshots/testcase3.png`

---

## 📖 Learning Outcomes

- Learned how to create and use Fragments in Android.
- Understood Fragment transactions and navigation.
- Implemented communication between Fragments using Bundles.
- Explored Android Studio Debug Mode.
- Understood the difference between Normal and Conditional Breakpoints.
- Improved debugging skills by inspecting variables and the call stack.

---
