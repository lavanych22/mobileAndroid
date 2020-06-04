import React from "react";
import { View, Text, StyleSheet, FlatList } from "react-native";

const styles = StyleSheet.create({
  container: {
    paddingTop: 50
  },
  title: {
    color: "black",
    fontSize: 24,
    marginBottom: 20
  },
  itemStyle: {
    color: "#c66",
    fontSize: 18,
    backgroundColor: "#ccc",
    marginBottom: 20,
    marginLeft: 10,
    padding: 20
  }
});

const renderListItem = ({ item }) => {
  return (
    <View>
      <Text style={styles.itemStyle}>{item.busStopName}</Text>
    </View>
  );
};

const keyExtractor = item => {
  return item.id;
};

const data = [
  {
    id: "1",
    busStopName: "Kuplarkiv",
    time: "10:05",
    color: "red"
  },
  {
    id: "2",
    busStopName: "Antonovycha",
    time: "10:15",
    color: "blue"
  },
  {
    id: "3",
    busStopName: "Zalizniaka",
    time: "10:27",
    color: "gray"
  },
  {
    id: "4",
    busStopName: "Banderu",
    time: "10:34",
    color: "black"
  },
  {
    id: "5",
    busStopName: "Zelena",
    time: "10:49",
    color: "white"
  }
];

const DisplayAnImage = () => {
  return (
    <View style={styles.container}>
      <Text style={styles.title}>Графік зупинок 13 тролейбуса</Text>
      <FlatList
        data={data}
        renderItem={renderListItem}
        keyExtractor={keyExtractor}
      />
    </View>
  );
};

export default DisplayAnImage;
