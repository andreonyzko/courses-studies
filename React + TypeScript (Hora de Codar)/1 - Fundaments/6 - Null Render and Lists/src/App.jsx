import { Form } from "./components/Form";
import { Warning } from "./components/Warning";
import { List } from "./components/List";
import { useState } from "react";

function App() {
  const [userlist, setUserlist] = useState([]);

  function addUser(username){
    setUserlist([...userlist, username]);
  }

  return (
    <>
      <Form addUser={addUser}></Form>
      <Warning warning={userlist.length === 0? 'No registers' : null}></Warning>
      <List list={userlist}></List>
    </>
  );
}

export default App;
