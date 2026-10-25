const person = {
    name:'my name',
    address:{
        line:'Baker Street',
        city:'London',
        country:'UK'
    },
    profiles:['google','naver','twitter'],
    printProfile: () => {
        person.profiles.map(
            profile => console.log(profile)
        )
    }
}



export default function LearningJavaScript(){
    return (
        <>
            <div>{person.name}</div>
            <div>{person.address.line}</div>
            <div>{person.profiles[0]}</div>
            <div>{person.printProfile()}</div>
        </>
    )
}