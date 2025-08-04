import { Greeting } from "./components/Greeting";
import { Counter } from "./components/Counter";
import { TaskList } from "./components/TaskList";

function App() {
  return (
    <>
    <Greeting name="Andre" />
    <Counter></Counter>
    <TaskList></TaskList>
    </>
  );
}

export default App;
