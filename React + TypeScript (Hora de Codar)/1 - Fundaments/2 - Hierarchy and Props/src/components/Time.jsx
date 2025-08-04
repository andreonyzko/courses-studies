function Time({ hour, minutes, weekDay, month, day }) {
    const months = [
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    ];

    const daysOfWeek = [
        "Sunday", "Monday", "Tuesday", "Wednesday",
        "Thursday", "Friday", "Saturday"
    ];

    weekDay = daysOfWeek[weekDay];
    month = months[month];

    return (
        <>
            <h1>{hour}:{minutes}</h1>
            <h2>{weekDay}, {month} {day}</h2>
        </>
    )
}

export default Time;