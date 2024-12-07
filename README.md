# Toast in Android

This repository demonstrates how to use **Toast** in Android applications. A `Toast` is a simple pop-up message that provides feedback to users about an operation. It appears on the screen for a short duration and disappears automatically.

---

## Features
- Display simple text messages to users.
- Short and long duration options for the message.
- Supports custom layouts for more complex Toast designs.

---

## Demo
![Toast Demo](path/to/demo.gif)

---

## Getting Started

### Prerequisites
- Android Studio
- Minimum API Level: 14 (Android 4.0 Ice Cream Sandwich)

---

## Usage

### 1. **Basic Toast**
To display a simple text message:
```kotlin
Toast.makeText(this, "This is a Toast message!", Toast.LENGTH_SHORT).show()
