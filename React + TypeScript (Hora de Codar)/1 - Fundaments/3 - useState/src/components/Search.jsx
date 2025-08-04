import { useState } from "react";

function Search() {
    const [query, setQuery] = useState("");

    function handleSubmit(e) {
        e.preventDefault();
        console.log(query);
    }

    return (
        <form onSubmit={e => handleSubmit(e)}>
            <p>
                <input type="text" placeholder="Search" 
                onChange={e => setQuery(e.target.value)}/>
            </p>
            <button type="submit">Search</button>
            <p>
                <output>Query: {query}</output>
            </p>
        </form>
    )
}

export default Search;