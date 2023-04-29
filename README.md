# Android Assignment 2 (Assignment 2 on moodle)

## Assignment Description
This assignment was to see if we can create a matching front-end for an android application when given a specific page layout. For this assignment, we were given photos of an app and asked to recreate the front-end for it. Part of this assignment was to use a navigation stack in order to fully move through all the given pages. 

These were the given images

![image](https://user-images.githubusercontent.com/83609351/235287105-aab7d162-e10f-4639-a121-f8352d5a6bc6.png)

## Goals
- Create components that matched the components in the photos
- Create pages and assemble all the UI components together on each page
- Successfully navigate to each page

## Structure

- App
     - src (contains app files for the app)
       - main (the main files that run the app)
         - java/com/kzirk/assignment2 (the container that holds runnable code)
           - composables (these are custom made UI pieces that can be combined and used on a page)
             - backgrounds (holds all the backgrounds that I used for the app, setting the image as a background, making sure it fills the background, and making sure it's put behind everything on screen)
             - forms (this contains any forms that a user would want to input anything for)
             - navComponents (contains both the navigation bar that gets displayed at the very bottom after login, and also each component inside the navigation bar)
             - CardComponent (This is a component that renders a card and it's respective information)
             - Logo (this renders the logo correctly)
           - models
             - Card.kt (card model that holds all the information I need to use for a card object)
           - nav (contains all the code needed in order to navigate between each screen)
           - screens (each screen renders a page of the app which contains the components made above)
           - ui/theme (Used to set a 'theme' for the whole app, this includes colours, shapes, fonts, themes for the whole app)
           - CardRepository.kt (a temporary card repository for the app, in a full app we would get this list from an API)
           - MainActivity.kt (this is where the app starts from)
       - AndroidManifest.xml (contains app permissions)
       - res (contains all 'drawables' or front-end images, fonts, colors, icons)


## How to run the program
1. Have a working pc with internet connection
2. Install Android Studio
3. Clone repository
4. Open the cloned repository and build it in Android Studio
5. Select Pixel 3a as a virtual testing device (you may have to create a virtual instance of this phone)
5. Run the program on the Pixel 3a device

## How to test the program
1. Once opened and running in Android Studio, click on the 'Don't have an account? Sign up!' text below the login to view the signup page
2. Click login (this is a UI assignment, so this links right to the main page)
3. Scroll through and view the main page
4. Select the icons at the bottom to navigate to different screens
