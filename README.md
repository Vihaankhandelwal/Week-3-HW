# Week-3-HW

Homework 2: Quicksort Partition Schemes
Overview

This assignment implements and tests two partitioning schemes used in the Quicksort algorithm:

• Lomuto partition
• Hoare partition

Both methods are implemented in Java and validated using unit tests written with JUnit 5.

Files Included

Partition.java
Contains static implementations of:

partitionLomuto(int[] a, int low, int high)

partitionHoare(int[] a, int low, int high)

Each method rearranges the array in place and returns the partition index.

PartitionTest.java
JUnit 5 test class that verifies correctness of both partition methods using:

A sorted array

An empty array

An unsorted array provided in the assignment description
