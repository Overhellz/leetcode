# Code Templates

https://leetcode.com/explore/interview/card/cheatsheets/720/resources/

---

## Two pointers

- Два указателя: первый - в начале массива, второй - в конце массива

```java
public int someMethod(int[] arr) {
    int left = 0;
    int right = arr.length - 1;
    int ans = 0;

    while (left < right) {
        // do some logic here with left and right
        if (condition) {
            left++;
        } else {
            right--;
        }
    }

    return ans;
}
```

- Два указателя: первый - в начале первого массива, второй - в начале второго массива

```java
public int someMethod(int[] arr1, int[] arr2) {
    int first = 0;
    int second = 0;
    int ans = 0;

    while (first < arr1.length && second < arr2.length) {
        // do some logic here
        if (condition) {
            first++;
        } else {
            second++;
        }
    }

    while (first < arr1.length) {
        // do logic
        first++;
    }

    while (second < arr2.length) {
        // do logic
        second++;
    }

    return ans;
}
```

---

## Sliding window

```java
public int someMethod(int[] arr) {
    int left = 0;
    int ans = 0;
    int current = 0;

    for (int right = 0; right < arr.length; right++) {
        // do logic here to add arr[right] to current

        while (windowConditionBroken) {
            // remove arr[left] from curr
            left++;
        }

        // update ans
    }

    return ans;
}
```

---

## Build a prefix sum

```java
public int[] someMethod(int[] arr) {
    int[] prefix = new int[arr.length];
    prefix[0] = arr[0];

    for (int i = 1; i < arr.length; i++) {
        prefix[i] = prefix[i - 1] + arr[i];
    }

    return prefix;
}
```

---

## Cheatsheets

TODO
