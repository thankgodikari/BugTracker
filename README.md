# Bug Tracker Android Application

## Overview

Bug Tracker is an Android application developed in Kotlin as part of the University of the People Mobile Applications course assignment. The project demonstrates the design and implementation of an offline-capable issue tracking application that allows developers to create, manage, and synchronize software bug reports.

The application follows modern Android architecture principles by separating data persistence, networking, lifecycle management, and version control into well-defined components.

---

## Project Objectives

The application demonstrates:

- Local data persistence using Room architecture
- Remote synchronization using Retrofit
- Offline-first application design
- Lifecycle-aware state management
- Background synchronization using WorkManager
- Git-based version control workflow

---

## Architecture

The application follows a layered architecture:


UI
│
▼
ViewModel
│
▼
Repository
├───────────────┐
▼ ▼
Room Retrofit
(Local) (Remote)


The Repository acts as the single source of truth by coordinating communication between local storage and remote services.

---

## Project Structure


com.codenovate.bugtracker

data
├── local
│ ├── AppDatabase.kt
│ ├── IssueDao.kt
│ └── IssueEntity.kt
│
├── remote
│ └── IssueApiService.kt
│
repository
└── IssueRepository.kt

viewmodel
└── IssueViewModel.kt

worker
├── SyncManager.kt
└── SyncWorker.kt


---

## Features

### Local Storage

- IssueEntity data model
- DAO interface
- Repository abstraction
- Offline-first architecture

### Remote Synchronization

- Retrofit API interface
- REST operations
    - GET
    - POST
    - PUT
    - DELETE
- Repository synchronization logic

### Lifecycle Management

- ViewModel for state preservation
- Separation of UI and business logic

### Background Synchronization

- WorkManager
- SyncWorker
- SyncManager
- Automatic retry mechanism
- Exponential backoff policy
- Network connectivity constraints

### Version Control

Git was used throughout development using:

- feature branches
- hotfix branches
- descriptive commits
- GitHub remote repository
- release tags (v1.0 and v1.1)

---

## Technologies Used

- Kotlin
- Android Studio
- Room Architecture
- Retrofit
- ViewModel
- WorkManager
- Git
- GitHub

---

## Assignment Requirements Addressed

The project demonstrates:

- Room database schema design
- CRUD operations through DAO
- Repository pattern
- Retrofit integration
- Lifecycle-aware state management
- Reliable synchronization strategy
- Retry mechanism using WorkManager
- Professional Git workflow

---

## Author

Developed for the University of the People Mobile Applications course.