import React from "react";
import { useState } from "react";

export const Counter = () => {
  const [value, setValue] = useState(0);

  function handleClick() {
    setValue(value + 1);
  }

  return (
    <section>
      <p><output>{value}</output></p>
      <button onClick={handleClick}>Count</button>
    </section>
  );
};
