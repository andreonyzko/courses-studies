import { useState } from "react";
import { Conditional } from "./Conditional";

export const Form = () => {
  const [value, setValue] = useState("");

  function handleSubmit(e) {
    e.preventDefault();
  }

  return (
    <>
      <form onSubmit={handleSubmit}>
        <input
          type="password"
          onChange={(e) => setValue(e.target.value)}
          value={value}
          placeholder="Enter key word"
        />
      </form>
      <Conditional keyword={value}></Conditional>
    </>
  );
};
