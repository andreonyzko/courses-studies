const userName = "Andre"
type Username = typeof userName;

// ------------------------------

const settings = {
    difficulty: 'easy',
    minLevel: 10,
    didStart: false,
    players: ['Andre', 'Kaua']
}

type Settings = typeof settings;

function loadData(settings:Settings) {
    // ...
}

loadData(settings);

