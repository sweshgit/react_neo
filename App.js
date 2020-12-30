/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow strict-local
 */

import ReactMoE, { MoEProperties } from 'react-native-moengage';
import React from 'react';
import { View, Text, Image, ScrollView, TextInput, StyleSheet } from 'react-native';

const App = () => {

  ReactMoE.setUserUniqueID("abc@xyz.com");
   
  // Console.log("Moengage Integration ");

  ReactMoE.initialize();
 
  return (
    <ScrollView>
      <Text>Hello World</Text>
      <View>
        <Text>Testing App</Text>
      </View>
 
      <TextInput
        style={{
          height: 40,
          borderColor: 'gray',
          borderWidth: 1
        }}
        defaultValue="You can type in me"
      />
    </ScrollView>
  );
}

export default App;
