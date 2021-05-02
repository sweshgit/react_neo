import ReactMoE from 'react-native-moengage';
import React from 'react';
import { View, Text, Image, ScrollView, TextInput, StyleSheet } from 'react-native';

const App = () => {

  console.log("This is test page.");

  ReactMoE.setEventListener("inAppCampaignShown", (inAppInfo) =>
     console.log("inAppCampaignShown", inAppInfo)
   );

  ReactMoE.setEventListener("inAppCampaignClicked", (inAppInfo) =>
    console.log("inAppCampaignClicked", inAppInfo)
  );
  
  ReactMoE.setEventListener("inAppCampaignDismissed", (inAppInfo) =>
  console.log("inAppCampaignDismissed", inAppInfo)
);

ReactMoE.setEventListener("inAppCampaignCustomAction", (inAppInfo) =>
  console.log("inAppCampaignCustomAction", inAppInfo)
);

  ReactMoE.showInApp();
  
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