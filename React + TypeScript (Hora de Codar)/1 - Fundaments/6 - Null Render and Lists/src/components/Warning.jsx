import React from "react";

export const Warning = ({ warning }) => {
  if (!warning) return null;

  return <p>{warning}</p>;
};
