
# Android Live and File Templates

This repository contains live and file templates to be used in Android Studio during the development of an Android Application.

Many of live and file templates are linked with [InitiateAndroid](https://github.com/maitriig3/InitiateAndroid). InitiateAndroid is a library and a gradle plugin to kick start the development of Android application. It makes use of some of the templates here to generate files and code to support some of the functionality in it. More information about how to use the templates along with the library is found [here](https://github.com/maitriig3/InitiateAndroid).

### Description of files present in repository

1. fileTemplates

   This folder contains the kotlin files for file templates

2. options

   This folder contains an xml file with settings added for file templates

3. templates

   This folder contains xml files of live templates

4. Live-File-Templates.zip

   This file is generated using 'Export Settings...' option in Android Studio (File -> Manage IDE Settings). All the above folders are got when this file is unzipped. But to import the settings in Android Studio, unzipping is not necessary. Check the Setup section to get the steps.


### Setup

To import the live and file templates, follow the steps listed below,

- Download the zip file 'Live-File Templates.zip'. This file is present at the top level directory of this repository.
- In Android Studio, go to File -> Manage IDE Settings -> Import Settings ...
- Choose the zip file downloaded when window is prompted to choose location.
- Select all the options
	- File Templates
	- File Templates (schemes)
	- Live templates (schemes)
- Click on 'OK'

Now the live and file templates are imported into your Android Studio

#### Tip
	To import classes directly, enable 'Add unambiguous imports on the fly' in 'Settings -> Editor -> General -> Auto Import -> Kotlin'

### Live Templates

#### initiateSharedPreferencesInDaggerHilt
- Adds provides function for shared preferences and PreferenceRepository in Module class of Dagger Hilt.
- PreferenceRepository is added by using 'InitiateSharedPreferences' file template.

#### bb
- Adds 'app:layout_constraintBottom_toBottomOf=""' in xml.

#### tt
- Adds 'app:layout_constraintTop_toTopOf=""' in xml.

#### ss
- Adds 'app:layout_constraintStart_toStartOf=""' in xml.

#### ee
- Adds 'app:layout_constraintEnd_toEndOf=""' in xml.

#### bt
- Adds 'app:layout_constraintBottom_toTopOf=""' in xml.

#### tb
- Adds 'app:layout_constraintTop_toBottomOf=""' in xml.

#### se
- Adds 'app:layout_constraintStart_toEndOf=""' in xml.

#### es
- Adds 'app:layout_constraintEnd_toStartOf=""' in xml.

#### bbp
- Adds 'app:layout_constraintBottom_toBottomOf="parent"' in xml.

#### ttp
- Adds 'app:layout_constraintTop_toTopOf="parent"' in xml.

#### ssp
- Adds 'app:layout_constraintStart_toStartOf="parent"' in xml.

#### eep
- Adds 'app:layout_constraintEnd_toEndOf="parent"' in xml.

#### btp
- Adds 'app:layout_constraintBottom_toTopOf="parent"' in xml.

#### tbp
- Adds 'app:layout_constraintTop_toBottomOf="parent"' in xml.

#### sep
- Adds 'app:layout_constraintStart_toEndOf="parent"' in xml.

#### esp
- Adds 'app:layout_constraintEnd_toStartOf="parent"' in xml.

#### initiateRoomDatabaseInDaggerHilt
- Adds provides function for database builder in Module class of Dagger Hilt.
- Room Database dependencies should be added and classes used are generated using 'InitiateRoomDatabase' file template.


### Live Templates - Dependent on [InitiateAndroid](https://github.com/maitriig3/InitiateAndroid)

#### connParameter
- Adds parameter for ConnectionRepository in ViewModel.

#### isInternetConnectedDeclare
- Declare variables in ViewModel.

#### isInternetConnectedSelect
- Select a block of code and enclose it with this live template to run whenever internet connectivity changes.

#### isInternetConnectedTimesSelect
- Select a block of code and enclose it with this live template to run whenever internet connectivity changes only a certain number of times.

#### initiateRetrofitInDaggerHilt
- Adds two provides functions in Module class of Dagger Hilt.
- Functions are for Retrofit Builder and NetworkRepository.
- Files required for this are generated using 'InitiateRetrofit' file template and depends on classes in 'InitiateAndroid'.

#### initiateInternetConnectivityInDaggerHilt
- Adds provides function for ConnectivityRepository in Module class of Dagger Hilt.

### File Templates

#### InitiateRecyclerViewWithOnClick
- Creates a ListAdapter Class with inputs given
	- Binding File: ViewBinding should enabled and binding file of item layout should be given as input.
	- Adapter Name: Add only description of adapter in field 'Adapter Name'. For example, if the input to field is 'Test', then class name would be 'TestAdapter' and view holder name would be 'TestViewHolder'
	- Item Type: Add the class name of item

#### InitiateListAdapterWithOnClick
- Creates a ListAdapter Class with inputs given
	- Binding File: ViewBinding should enabled and binding file of item layout should be given as input.
	- Adapter Name: Add only description of adapter in field 'Adapter Name'. For example, if the input to field is 'Test', then class name would be 'TestAdapter' and view holder name would be 'TestViewHolder'
	- Item Type: Add the class name of item

#### InitiateRoomDatabase
- This should be called from base package and all the files are created in 'data/local/room' package
- It creates three files
	- A sample entity class in 'data/local/room/entity' package
	- A sample dao class in 'data/local/room/dao' package
	- An AppDatabase class extending RoomDatabase with table defined in entity file, in 'data/local/room' package.

#### InitiateSharedPreferences
- This should be called from base package and all the files are created in 'data/local/preferences' package
- It creates three files
	- An object class 'PreferenceKeys' to store key values
	- An interface 'PreferenceRepository' which contains 'get' and 'put' functions for String, Int and Boolean
	- An implementation class 'PreferenceRepository' which contains implementations of 'get' and 'put' functions

#### InitiateImpl
- Creates an interface with the name provided and a class with the suffix 'Impl' and implementing the interface

#### InitiateDaggerHilt
- Creates Module class for Dagger-Hilt with inputs,
	- Initiate Retrofit : If 'InitiateRetrofit' file template has already been called, then add the value 'true' and if not, leave it blank.
	- Initiate Room Database : If 'InitiateRoomDatabase' file template has already been called, then add the value 'true' and if not, leave it blank.
	- Initiate Shared Preferences : If 'InitiateSharedPreferences' file template has already been called, then add the value 'true' and if not, leave it blank.

### File Templates - Dependent on [InitiateAndroid](https://github.com/maitriig3/InitiateAndroid)

#### ViewBindingFragment
- Creates a fragment extending ViewBindingFragment from InitiateAndroid
	- File Name: Name of fragment
	- Layout Binding: ViewBinding should enabled and binding file of item layout should be given as input.

