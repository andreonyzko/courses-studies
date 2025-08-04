import Time from "./Time";

function Welcome(props) {
    const date = new Date();
    const hour = date.getHours();
    const minutes = date.getMinutes();
    const weekDay = date.getDay();
    const month =date.getMonth();
    const day = date.getDate();

    return (
        <section>
            <Time hour={hour} minutes={minutes} weekDay={weekDay} month={month} day={day}></Time>
            <p>Welcome {props.username}</p>
        </section>
    )
}

export default Welcome;